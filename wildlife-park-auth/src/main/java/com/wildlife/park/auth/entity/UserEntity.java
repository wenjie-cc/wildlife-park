package com.wildlife.park.auth.entity;

import com.wildlife.park.common.entity.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author yan
 * @desc UserEntity
 * @date 2020/4/12
 */
@Data
@Entity
@Table(name = "WP_USER", schema = "C##WLPARK")
public class UserEntity extends BaseEntity{

    @Column(name = "USER_NAME")
    private String name;

    @Column(name = "AGE")
    private Integer age;

    /**
     * 备注
     */
    @Column(name = "MEMO")
    private String memo;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "CREATED_TIME")
    private LocalDateTime createdTime;

    @Column(name = "MODIFIED_BY")
    private String modifiedBy;

    @Column(name = "MODIFIED_TIME")
    private LocalDateTime modifiedTime;

    @Column(name = "IS_DELETED")
    private Integer isDeleted;

}
