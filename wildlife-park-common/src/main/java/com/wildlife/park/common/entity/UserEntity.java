package com.wildlife.park.common.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author yan
 * @desc UserEntity
 * @date 2020/4/12
 */
@Data
@Entity
@Table(name = "WP_USER", schema = "C##WLPARK")
public class UserEntity extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "wp_user_id")
    @SequenceGenerator(name = "wp_user_id" ,sequenceName = "WP_USER_SEQ", allocationSize = 1)
    @Column(name = "ID")
    private Long userId;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "AGE")
    private Integer age;

}
