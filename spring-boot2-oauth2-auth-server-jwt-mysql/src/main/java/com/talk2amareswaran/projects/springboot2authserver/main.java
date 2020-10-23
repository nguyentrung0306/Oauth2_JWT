package com.talk2amareswaran.projects.springboot2authserver;

import com.talk2amareswaran.projects.springboot2authserver.config.CustomTokenEnhancer;
import com.talk2amareswaran.projects.springboot2authserver.config.OAuth2Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.KeyStoreKeyFactory;

public class main {

    public static void main(String[] args) {
        jwtAccessTokenConverter();
        System.out.println(jwtAccessTokenConverter());
    }

    public static JwtAccessTokenConverter jwtAccessTokenConverter() {
        JwtAccessTokenConverter converter = new CustomTokenEnhancer();
        converter.setKeyPair(new KeyStoreKeyFactory(new ClassPathResource("jwt.jks"), "password".toCharArray()).getKeyPair("jwt"));
        return converter;
    }

}
