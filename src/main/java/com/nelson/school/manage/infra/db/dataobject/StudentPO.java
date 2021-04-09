package com.nelson.school.manage.infra.db.dataobject;

import com.nelson.school.manage.share.enums.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author nelson
 * @Desc student persistent object
 * @date 2021/3/25 9:18 下午
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "hms_student_info")
public class StudentPO extends BasePO{
    /**
     * 学生id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Enumerated(EnumType.ORDINAL)
    private Gender gender;
    /**
     * 班级id
     */
    @Column(name = "class_id")
    private int classId;

}
