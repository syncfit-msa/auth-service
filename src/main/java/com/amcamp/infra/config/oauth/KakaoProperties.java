package com.amcamp.infra.config.oauth;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import lombok.AllArgsConstructor;

@RefreshScope
@AllArgsConstructor
@Getter
@ConfigurationProperties(prefix = "oauth.kakao")
public class KakaoProperties {

    private String clientId;
    private String clientSecret;
    private String redirectUri;
    private String grantType;
}