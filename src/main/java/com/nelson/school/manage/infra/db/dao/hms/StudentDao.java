package com.nelson.school.manage.infra.db.dao.hms;

import com.nelson.school.manage.infra.db.dataobject.StudentPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author nelson
 * @Desc student dao
 * @date 2021/3/25 9:02 下午
 */
public interface StudentDao extends JpaRepository<StudentPO, Long> {
}
