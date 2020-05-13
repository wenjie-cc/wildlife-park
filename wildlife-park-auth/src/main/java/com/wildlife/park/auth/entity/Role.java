package com.wildlife.park.auth.entity;

import com.wildlife.park.common.entity.BaseUniqueNameEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author wenjie
 */
@Data
@Entity
@Table(name = "WP_ROLE", schema = "C##WLPARK")
public class Role extends BaseUniqueNameEntity {
    /**
     * 是否启用
     */
    private boolean enabled;

    /**
     * 是否内置角色
     */
    private boolean buildIn;

    /**
     * 备注
     */
    @Column(columnDefinition = "TEXT")
    private String memo;

    /**
     * 用户
     */
    @ManyToMany(cascade = {CascadeType.REFRESH, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "role_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> users = new HashSet<>();

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinTable(name = "role_functionality", joinColumns = @JoinColumn(name = "role_id"), inverseJoinColumns = @JoinColumn(name = "functionality_id"))
    private Set<Functionality> functionaries = new HashSet<>();
}
