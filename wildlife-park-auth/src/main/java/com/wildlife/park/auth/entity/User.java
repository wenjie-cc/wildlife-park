package com.wildlife.park.auth.entity;

import com.wildlife.park.common.entity.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author yan
 * @desc UserEntity
 * @date 2020/4/12
 */
@Data
@Entity
@Table(name = "WP_USER", schema = "C##WLPARK")
public class User extends BaseEntity {

    @Column(name = "NAME")
    private String name;

    /**
     * 昵称
     */
    @Column(name = "NICK_NAME")
    private String nickname;

    /**
     * 邮箱地址
     */
    @Column(name = "MAIL")
    private String mail;

    /**
     * 手机号码
     */
    @Column(name = "MOBILE")
    private String mobile;

    /**
     * 头像
     */
    @Column(name = "AVATAR")
    private String avatar;

    /**
     * 快访码
     */
    @Column(name = "ACCESS_CODE")
    private String accessCode;

    /**
     * 允许快访码登录
     */
    @Column(name = "ALLOW_CODE_ACCESS")
    private boolean allowCodeAccess;

    /**
     * 登录密码
     */
    @Column(name = "PASSWORD")
    private String password;

    /**
     * 是否启用
     */
    @Column(name = "ENABLED")
    private boolean enabled;

    /**
     * 是否内置用户
     */
    @Column(name = "BUILD_IN")
    private boolean buildIn;

    /**
     * 是否锁定
     */
    @Column(name = "LOCKED")
    private boolean locked;

    /**
     * 备注
     */
    @Column(name = "MEMO")
    private String memo;

    /**
     * 登录失败重试次数
     */
    @Column(name = "RETRY_TIMES")
    private int retryTimes;

    /**
     * 是否需要修改密码，新创建的用户默认需要修改密码
     */
    @Column(name = "CHANGE_PASSWORD")
    private boolean changePassword;

    /**
     * 锁定时间
     */
    @Column(name = "LOCK_AT")
    private Date lockAt;

    /**
     * 解锁时间
     */
    @Column(name = "UNLOCK_AT")
    private Date unlockAt;


    /**
     * 创建人
     */
    @Column(name = "CREATED_BY")
    private String createdBy;

    /**
     * 创建时间
     */
    @Column(name = "CREATED_TIME")
    private LocalDateTime createdTime;

    /**
     * 修改人
     */
    @Column(name = "MODIFIED_BY")
    private String modifiedBy;

    /**
     * 修改时间
     */
    @Column(name = "MODIFIED_TIME")
    private LocalDateTime modifiedTime;

    /**
     * 角色
     */
    @ManyToMany(cascade = {CascadeType.REFRESH, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

}
