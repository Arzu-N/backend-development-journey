package com.example.education.configuration;
import ch.qos.logback.classic.layout.TTLLLayout;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;

@Configurable
public class MyBeanConfig {
    @Bean
    @Scope("prototype")
    public TTLLLayout layout(){
        return new TTLLLayout();
    }

}
