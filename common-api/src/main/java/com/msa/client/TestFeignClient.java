package com.msa.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.msa.domain.GithubUserResponseDomain;

@FeignClient(name = "common-api", url = "https://api.github.com", configuration = CommonFeignClientConfig.class)
public interface TestFeignClient {

    @GetMapping("/users/{githubId}")
    public GithubUserResponseDomain getGithubUser(@PathVariable("githubId") String githubId);
}
