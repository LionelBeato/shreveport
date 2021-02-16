package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        // TODO(): refactor so that there isn't a full constructor statement
        BCryptPasswordEncoder bCryptPasswordEncoder =
                new BCryptPasswordEncoder();

        return bCryptPasswordEncoder;
    }

}
