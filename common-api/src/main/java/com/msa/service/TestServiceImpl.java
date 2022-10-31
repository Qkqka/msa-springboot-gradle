package com.msa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msa.client.TestFeignClient;
import com.msa.domain.GithubUserResponseDomain;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestFeignClient testFeignClient;
    
    @Override
    public GithubUserResponseDomain getGithubUser(String githubId) {
        GithubUserResponseDomain result = this.testFeignClient.getGithubUser(githubId);
        log.debug("\nresult: {}", result);
        return result;
    }

}
