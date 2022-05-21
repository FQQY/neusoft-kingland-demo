package com.kingland.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author
 * @create 2022-05-16 12:33
 */
@Configuration
public class PasswordEncoderConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        // given a default strength value
        // uses the BCrypt strong hashing function
        return new BCryptPasswordEncoder(4);
    }
}
