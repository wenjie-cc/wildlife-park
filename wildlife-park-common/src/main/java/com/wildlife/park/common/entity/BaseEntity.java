package com.wildlife.park.common.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Persistable;
import org.springframework.data.util.ProxyUtils;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author yan
 * @desc BaseEntity
 * @date 2020/4/12
 */
@MappedSuperclass
@Getter
@Setter
public class BaseEntity implements Persistable<Long>, Serializable, Cloneable {

    private static final long serialVersionUID = -5871091074255592475L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    /**
     * 判断是否为新创建的实体
     *
     * @return 如果是新创建的实体返回True否则返回False
     */
    @Override
    @Transient
    public boolean isNew() {
        return null == this.getId();
    }

    @Override
    public boolean equals(Object obj) {
        if (null == obj) {
            return false;
        } else if (this == obj) {
            return true;
        } else if (!this.getClass().equals(ProxyUtils.getUserClass(obj))) {
            return false;
        } else {
            Persistable<?> that = (Persistable<?>) obj;
            return null != this.getId() && this.getId().equals(that.getId());
        }
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = hashCode + (null == this.getId() ? 0 : this.getId().hashCode() * 31);
        return hashCode;
    }

    @Override
    public BaseEntity clone() {
        try {
            return (BaseEntity) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
