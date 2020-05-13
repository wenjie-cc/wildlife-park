package com.wildlife.park.common.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * 名称唯一的实体基类，名称默认长度80
 *
 * @author wenjie
 */
@Data
@MappedSuperclass
public abstract class BaseUniqueNameEntity extends BaseEntity {
    @Column(unique = true, length = 80, nullable = false)
    private String name;
}
