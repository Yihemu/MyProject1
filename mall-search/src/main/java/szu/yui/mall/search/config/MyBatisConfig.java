package szu.yui.mall.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * mybatis配置类
 */
@Configuration
@MapperScan({"szu.yui.mall.mapper","szu.yui.mall.search.dao"})
public class MyBatisConfig {
}
