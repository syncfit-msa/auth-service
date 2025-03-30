package com.amcamp.infra.config.jwt;


import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import lombok.AllArgsConstructor;

@RefreshScope
@AllArgsConstructor
@Getter
@ConfigurationProperties(prefix = "jwt")
public class JwtProperties {

    private String accessTokenSecret;
    private String refreshTokenSecret;
    private Long accessTokenExpirationTime;
    private Long refreshTokenExpirationTime;
    private String issuer;

    public Long accessTokenExpirationMilliTime() {
        return accessTokenExpirationTime * 1000;
    }
    public Long refreshTokenExpirationMilliTime() {
        return refreshTokenExpirationTime * 1000;
    }
}