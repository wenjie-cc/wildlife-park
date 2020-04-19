package com.wildfife.park.core.service.feign;

import com.wildlife.park.common.entity.UserEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "wildlife-park-auth", fallback = UserAuthFallBack.class)
public interface UserAuthFeignService {

    @PostMapping(value = "/wp/auth/user-auth/authentication")
    public UserEntity userAuthentication(@RequestBody UserEntity userEntity);

    @GetMapping(value = "/wp/auth/user-auth/circuit-break/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String HelloWorldCircuitBreak(@PathVariable("id") Integer id);
}
