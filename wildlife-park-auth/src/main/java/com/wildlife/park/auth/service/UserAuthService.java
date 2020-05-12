package com.wildlife.park.auth.service;

import com.wildlife.park.auth.entity.UserEntity;

/**
 * @author wenjiewu
 */
public interface UserAuthService {
    /**
     *
     * @param userEntity
     * @return
     */
    UserEntity userAuthentication(UserEntity userEntity);
}
