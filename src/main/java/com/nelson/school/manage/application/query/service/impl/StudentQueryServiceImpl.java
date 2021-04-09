package com.nelson.school.manage.application.query.service.impl;

import com.nelson.school.manage.application.query.service.StudentQueryService;
import com.nelson.school.manage.domain.student.aggregate.Student;
import com.nelson.school.manage.domain.student.repo.StudentRepository;
import com.nelson.school.manage.ui.bean.result.StudentDetailResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author nelson
 * @Desc student manager implementation
 * @date 2021/3/29 5:40 下午
 */
@Service
public class StudentQueryServiceImpl implements StudentQueryService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentDetailResultBean getStudentDetail(long id) {

        Student student = studentRepository.findStudent(id);

        return StudentDetailResultBean
                .builder()
                .id(student.getId())
                .name(student.getName())
                .age(student.getAge())
                .gender(student.getGender().name())
                .build();
    }
}
