package com.summer.faststarter.datasource.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liuke on 2019/12/11 17:29
 */
@Configuration
@MapperScan({"com.summer.faststarter.datasource.mybatis"})
public class MyBatisConfig {

}
