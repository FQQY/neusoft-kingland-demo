package com.kingland.training.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;

/**
 * @author
 * @create 2022-05-16 12:33
 */
@Profile("!Security")
@Configuration
@EnableWebSecurity
public class NonSecurityConfig extends WebSecurityConfigurerAdapter {

    public NonSecurityConfig() {
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // @formatter:off
        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeRequests(authorize ->
                        authorize
                                .anyRequest().permitAll());
    }
}
