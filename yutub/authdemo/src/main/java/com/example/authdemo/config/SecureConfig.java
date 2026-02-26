package com.example.authdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecureConfig {
    @Bean
   public SecurityFilterChain securityFilterChain(HttpSecurity http){
       http.csrf(AbstractHttpConfigurer::disable)
               .authorizeHttpRequests(l->
                       l.requestMatchers("/api/auth/**").permitAll()
                       .anyRequest().authenticated()).httpBasic(Customizer.
                       withDefaults());//httpbasic default qaydada aktiv edilir
       return http.build();
   }
}

