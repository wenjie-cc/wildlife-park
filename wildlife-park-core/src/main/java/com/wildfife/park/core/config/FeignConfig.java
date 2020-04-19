package com.wildfife.park.core.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yan
 * @desc FeignConfig
 * @date 2020/4/19
 */
@Configuration
public class FeignConfig {
    /**
     * feignClient配置日志级别
     *
     * @return
     */
    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.BASIC;
    }
}
