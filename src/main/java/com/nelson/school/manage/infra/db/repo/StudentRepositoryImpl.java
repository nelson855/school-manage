package com.nelson.school.manage.infra.db.repo;

import com.nelson.school.manage.domain.student.aggregate.Student;
import com.nelson.school.manage.domain.student.repo.StudentRepository;
import com.nelson.school.manage.infra.db.dao.hms.StudentDao;
import com.nelson.school.manage.infra.db.dataobject.StudentPO;
import com.nelson.school.manage.infra.exception.ParamValidationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StudentRepositoryImpl implements StudentRepository {
    @Autowired
    private StudentDao studentDao;

    @Override
    public Student findStudent(long id) {
        StudentPO studentPO = studentDao.findById(id).orElse(null);
        if (studentPO == null) {
            log.error("can not find student info, id: {}", id);
            throw new ParamValidationException();
        }
        return Student.builder()
                .id(studentPO.getId())
                .name(studentPO.getName())
                .age(studentPO.getAge())
                .gender(studentPO.getGender())
                .build();
    }
}
