package com.wildlife.park.common.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author yan
 * @desc BaseEntity
 * @date 2020/4/12
 */
@MappedSuperclass
@Getter
@Setter
public class BaseEntity implements Serializable {
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
