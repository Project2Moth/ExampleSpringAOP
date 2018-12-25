package com.spring.aopdemo.config;

import com.spring.aopdemo.dao.AccountDAO;
import com.spring.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.spring.aopdemo.config")
public class DemoConfig {
    @Bean
    public AccountDAO accountDAO() {
        return new AccountDAO();
    }

    @Bean
    public MembershipDAO membershipDAO() {
        return new MembershipDAO();
    }
}
