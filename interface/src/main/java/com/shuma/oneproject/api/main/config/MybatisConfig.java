package com.shuma.oneproject.api.main.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Mybatis 配置
 *
 * @author 马文韬
 * @version 1.0
 * @date 2019/5/9
 */
@Configuration
@MapperScan(value = {
        "com.shuma.oneproject.infrastructure.data.main.repository.unitofwork.mapper"
})
@EnableTransactionManagement
public class MybatisConfig {
}
