package com.nelson.school.manage.domain.student.repo;

import com.nelson.school.manage.domain.student.aggregate.Student;

/**
 * @author nelson
 * @Desc student repository
 * @date 2021/3/28 2:36 下午
 */
public interface StudentRepository {
    /**
     * find student by id
     */
    Student findStudent(long id);
}
