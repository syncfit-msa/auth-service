package com.amcamp.domain.client;

import com.amcamp.domain.client.dto.request.MemberCreateRequest;
import com.amcamp.domain.client.dto.response.MemberResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "user-service", url = "http://user-service")
public interface MemberClient {
    @PostMapping("/members")
    MemberResponse createMember(@RequestBody MemberCreateRequest request);

}
