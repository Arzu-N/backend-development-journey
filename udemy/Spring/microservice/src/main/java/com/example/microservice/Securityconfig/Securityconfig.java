package com.example.microservice.Securityconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

import javax.sql.DataSource;

@EnableGlobalMethodSecurity(prePostEnabled=true)
public class Securityconfig extends WebSecurityConfigurerAdapter {
@Value("${security.signing-key")
    private String signingkey;
@Autowired
private DataSource defaultdatasource;
@Value("${security.security-realmname")
private String realmname;
@Value("${security.encoding-strength")
private String encoding_strength;
    @Bean
    public TokenStore tokenstore(){
        return new JdbcTokenStore(defaultdatasource);
    }
    @Bean
    public JwtAccessTokenConverter accesstokenconverter(){
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        converter.setSigningKey(signingkey);
        return converter;    }
    @Bean

    public AuthenticationManager authentionmanager() throws Exception {
        return super.authenticationManager();
    }
    @Bean
    public  BCryptPasswordEncoder bcryptpasswordencoder(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    @Primary
   public DefaultTokenServices defaulttokenservicees(){
       DefaultTokenServices defaulttokenservices = new DefaultTokenServices();
           defaulttokenservices.setTokenStore(tokenstore());
           defaulttokenservices.setSupportRefreshToken(true);
           return defaulttokenservices;
   }
   @Override
   public void configure(HttpSecurity http) throws Exception {
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
                .httpBasic().realmName(realmname).and()
                .csrf().disable();
   }

}
