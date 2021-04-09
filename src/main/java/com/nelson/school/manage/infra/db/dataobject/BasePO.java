package com.nelson.school.manage.infra.db.dataobject;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import java.util.Date;

/**
 * @author nelson
 * @Desc
 * @date 2021/3/29 9:43 下午
 */
@Getter
@Setter
@NoArgsConstructor
public class BasePO {
    @Column(name = "create_time")
    private Date createTime;
    private long creator;
    @Column(name = "update _time")
    private Date updateTime;
    private long updater;
    private long version;
}
