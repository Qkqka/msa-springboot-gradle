package com.msa.service;

import java.util.List;

import com.msa.domain.GithubUserResponseDomain;

public interface CommonService {

    public GithubUserResponseDomain getGithubUser(String githubId);

    public List<String> selectCodeList();

    public String selectCode(String codeId);

}
