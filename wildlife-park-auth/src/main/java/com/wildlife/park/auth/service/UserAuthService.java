package com.wildlife.park.auth.service;

import com.wildlife.park.common.entity.UserEntity;

public interface UserAuthService {
    public UserEntity userAuthentication(UserEntity userEntity) throws Exception;
}
