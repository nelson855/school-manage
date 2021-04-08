package com.nelson.school.manage.ui.bean.result;

import lombok.Builder;
import lombok.Data;

/**
 * @author nelson
 * @Desc
 * @date 2021/3/29 5:58 下午
 */
@Data
@Builder
public class StudentDetailResultBean {
    private long id;
    private String name;
    private int age;
    private String gender;
}
