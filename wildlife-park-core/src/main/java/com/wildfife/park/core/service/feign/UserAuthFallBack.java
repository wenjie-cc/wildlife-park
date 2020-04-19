package com.wildfife.park.core.service.feign;

import com.wildlife.park.common.entity.UserEntity;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

/**
 * @author yan
 * @desc UserAuthFallBack
 * @date 2020/4/19
 */
@Component("userAuthFallBack")
@Log4j2
public class UserAuthFallBack implements UserAuthFeignService{
    @Override
    public UserEntity userAuthentication(UserEntity userEntity) {
        log.error("User Auth Fall Back==> Resource is busy, please try again in 10 seconds.  /(ㄒoㄒ)/~~");
        return null;
    }

    @Override
    public String HelloWorldCircuitBreak(final Integer id) {
        log.error("HelloWorldCircuitBreak Fall Back==> Resource is busy, please try again in 10 seconds.  /(ㄒoㄒ)/~~");
        return null;
    }
}
