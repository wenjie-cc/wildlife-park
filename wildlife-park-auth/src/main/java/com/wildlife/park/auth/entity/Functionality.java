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
public class Functionality extends BaseUniqueNameEntity {
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "WP_ROLE_FUNCTIONALITY", joinColumns = @JoinColumn(name = "FUNCTIONALITY_ID"), inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
    private Set<Role> roles = new HashSet<>();

    @ManyToOne(targetEntity = Functionality.class, cascade = {CascadeType.REFRESH})
    private Functionality parent;

    @OneToMany(targetEntity = Functionality.class, cascade = CascadeType.ALL, mappedBy = "parent", fetch = FetchType.LAZY)
    private Set<Functionality> children = new HashSet<>();

    @Column(columnDefinition = "TEXT")
    private String memo;
}
