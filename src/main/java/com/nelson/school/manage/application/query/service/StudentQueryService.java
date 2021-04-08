package com.nelson.school.manage.application.query.service;

import com.nelson.school.manage.ui.bean.result.StudentDetailResultBean;

/**
 * @author nelson
 * @Desc
 * @date 2021/3/29 5:42 下午
 */
public interface StudentQueryService {
    /**
     * 根据id获取学生信息详情
     */
    StudentDetailResultBean getStudentDetail(long id);
}
