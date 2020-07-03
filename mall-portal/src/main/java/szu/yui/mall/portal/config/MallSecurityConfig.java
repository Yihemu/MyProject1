package szu.yui.mall.portal.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import szu.yui.mall.portal.service.UmsMemberService;
import szu.yui.security.config.SecurityConfig;

/**
 * mall-security模块相关配置
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class MallSecurityConfig extends SecurityConfig {

    @Autowired
    private UmsMemberService memberService;

    @Bean
    public UserDetailsService userDetailsService() {
        //获取登录用户信息
        return username -> memberService.loadUserByUsername(username);
    }
}
