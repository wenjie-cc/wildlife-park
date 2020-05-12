package com.wildlife.park.auth.repository;

import com.wildlife.park.auth.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author yan
 * @desc UserEntity
 * @date 2020/4/12
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> , JpaSpecificationExecutor<UserEntity> {
}
