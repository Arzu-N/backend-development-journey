package com.example.microservice.Resourceserverconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;

@Configuration
public class Resourceserverconfig extends ResourceServerConfigurerAdapter {
    @Autowired
    private ResourceServerTokenServices tokenservices;
    @Value("${security.jwt.resource-ids}")
    private String resourceids;
    @Override
    public void configure(ResourceServerSecurityConfigurer resources){
        resources.resourceId(resourceids).tokenServices(tokenservices);
    }
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.requestMatchers()
                .and()
                .authorizeRequests()
                .antMatchers("/actuator/**","/api-docs/**")
                .permitAll()
                .antMatchers("/**")
                .authenticated();

    }
}
