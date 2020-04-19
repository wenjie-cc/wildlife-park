package com.wildfife.park.core.controller;

import com.wildfife.park.core.service.feign.UserAuthFeignService;
import com.wildlife.park.common.constant.CommonConstants;
import com.wildlife.park.common.entity.UserEntity;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yan
 * @desc UserAuthRestController
 * @date 2020/4/18
 */
@Controller
@Log4j2
@RequestMapping("user-core")
public class UserAuthRestController implements CommonConstants {
    @Autowired
    UserAuthFeignService userAuthFeignService;

    @PostMapping(value = "/authentication", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Map<String, String>> userAuthentication(@RequestBody UserEntity userEntity){
        Map<String, String> map = new HashMap<>();
        try {
            long t1= System.currentTimeMillis();
            final UserEntity userInfo = userAuthFeignService.userAuthentication(userEntity);
            long t2= System.currentTimeMillis();
            System.out.println("(t2-t1) = " + (t2-t1));
            if(userInfo==null){
                map.put(RESPONSE_MSG_KEY, "Failed to Auth");
                log.error("Failed to Auth。");
                return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
            }
        }catch (Exception e){
            map.put(RESPONSE_MSG_KEY, e.getMessage());
            log.error("Failed to Auth"+e);
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        map.put(RESPONSE_MSG_KEY, "User Auth Successfully.");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @GetMapping(value = "/circuit-break/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String HelloWorldCircuitBreak(@PathVariable("id") Integer id){
        final String s = userAuthFeignService.HelloWorldCircuitBreak(id);
        return s;
    }
}
