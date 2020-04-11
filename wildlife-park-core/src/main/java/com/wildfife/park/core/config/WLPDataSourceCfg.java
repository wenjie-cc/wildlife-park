package com.wildfife.park.core.config;

import com.wildlife.park.common.utils.LocalDateUtils;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author yan
 * @desc WLPDataSource
 * @date 2020/4/10
 */
@Configuration
@Log4j2
public class WLPDataSourceCfg {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "datasources.oracle")
    public DataSource wlpOracleDataSource(){
        final DataSource build = DataSourceBuilder.create().build();
        log.info(LocalDateUtils.parseToLocalDate("04/10/2020") +"DataSource:"+build);
        return build;
    }
}
