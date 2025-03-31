package com.amcamp.domain.auth.application;

import com.amcamp.domain.auth.dto.response.IdTokenResponse;
import com.amcamp.infra.config.feign.KakaoOauthClient;
import com.amcamp.infra.config.oauth.KakaoProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@Slf4j
@Service
@RequiredArgsConstructor
public class KakaoService {

    private final KakaoOauthClient kakaoOauthClient;
    private final KakaoProperties kakaoProperties;


    public IdTokenResponse getIdToken(String code) {
        return kakaoOauthClient.getIdToken(
                kakaoProperties.grantType(),
                kakaoProperties.clientId(),
                kakaoProperties.redirectUri(),
                code,
                kakaoProperties.clientSecret());
    }
}