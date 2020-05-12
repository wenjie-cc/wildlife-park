package com.wildlife.park.auth.controller;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wildlife.park.auth.service.UserAuthService;
import com.wildlife.park.common.constant.CommonConstants;
import com.wildlife.park.common.CommonResult;
import com.wildlife.park.auth.dto.UserDto;
import com.wildlife.park.auth.entity.UserEntity;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yan
 * @desc UserAuthController
 * @date 2020/4/18
 */
@RequestMapping("/user-auth")
@Controller
@Log4j2
public class UserAuthController implements CommonConstants {

    @Resource
    private UserAuthService userAuthService;

    @PostMapping(value = "/authentication", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public CommonResult<?> userAuthentication(@RequestBody UserEntity userEntity) {
        UserEntity entity = userAuthService.userAuthentication(userEntity);
        return CommonResult.success(UserDto.of(entity));
    }

    @HystrixCommand(fallbackMethod = "CircuitBreakFallBack")
    @GetMapping(value = "/circuit-break/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String HelloWorldCircuitBreak(@PathVariable("id") Integer id) {
        Map<String, String> map = new HashMap<>();
        UserEntity userInfo = null;
        if (id < 0) {
            throw new RuntimeException("Id should not be Negative==>" + id);
        }
        return "Success==>" + IdUtil.fastSimpleUUID();
    }

    /**
     * Fall Back Method for HelloWorldCircuitBreak(@PathVariable("id") Integer id);
     *
     * @param id
     * @return
     */
    public String CircuitBreakFallBack(@PathVariable("id") Integer id) {
        return "Resource is busy, Please try again in 10 seconds. o(╥﹏╥)o" + id;
    }

}
