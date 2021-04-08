package com.nelson.school.manage.domain.student.aggregate;

import com.nelson.school.manage.share.enums.Gender;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author nelson
 * @Desc
 * @date 2021/3/28 1:39 下午
 */
@Data
@Slf4j
@Builder
public class Student {
    /**
     * 主键id
     */
    private long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 性别
     */
    private Gender gender;
}
