package com.msa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.msa.client.CommonFeignClient;
import com.msa.client.TestFeignClient;
import com.msa.domain.GithubUserResponseDomain;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CommonServiceImpl implements CommonService {

    @Autowired
    private CommonFeignClient commonFeignClient;

    @Autowired
    private TestFeignClient testFeignClient;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public GithubUserResponseDomain getGithubUser(String githubId) {
        GithubUserResponseDomain result = this.testFeignClient.getGithubUser(githubId);
        log.debug("\nresult: {}", result);
        return result;
    }

    @Override
    public List<String> selectCodeList() {
        List<String> codeList = this.commonFeignClient.selectCodeList();
        return codeList;
    }

    @Override
    public String selectCode(String codeId) {
        // TODO Auto-generated method stub
        return null;
    }
}