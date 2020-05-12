package com.wildlife.park.auth.service;

import com.wildlife.park.auth.repository.UserRepository;
import com.wildlife.park.common.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author yan
 * @desc UserAuthServiceImpl
 * @date 2020/4/18
 */
@Service
public class UserAuthServiceImpl implements UserAuthService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserEntity userAuthentication(UserEntity userEntity) {

        final Optional<UserEntity> option = userRepository.findById(userEntity.getId());
        if (option.isPresent()) {
            return option.get();
        }
        return null;
    }
}
