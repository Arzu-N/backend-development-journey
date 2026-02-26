package com.example.microservice.Autorizationserverconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;

import java.util.Arrays;

@Configuration
public class Authorizatinserverconfig {
    @Value("clientid")
    private String client_id;
    @Value("clientsecret")
    private String client_secret;
    @Value("password")
    private String granttype;
    @Value("read")
    private String scoperead;
    @Value("${security.jwt.scope-write:write}")
    private String scopewrite;
    @Value("${security.jwt.resource-id")
    private String resourceids;

    @Autowired
private TokenStore tokenstore;
    @Autowired
private JwtAccessTokenConverter accesstokenconverter;
    @Autowired
    private AuthenticationManager authenticationmanager;
@Autowired
    private PasswordEncoder passwordencoder;

    public void configure(ClientDetailsServiceConfigurer configurer) throws Exception {
    configurer.inMemory()
            .withClient(client_id)
            .secret(passwordencoder.encode(client_secret))
            .authorizedGrantTypes(granttype)
            .scopes(scoperead,scopewrite)
            .resourceIds(resourceids);
}
public void configure(AuthorizationServerEndpointsConfigurer endpoints){
    TokenEnhancerChain enhancerchain = new TokenEnhancerChain();
    enhancerchain.setTokenEnhancers(Arrays.asList(accesstokenconverter));
    endpoints.tokenStore(tokenstore).accessTokenConverter(accesstokenconverter).tokenEnhancer(enhancerchain).authenticationManager(authenticationmanager);

}
}
