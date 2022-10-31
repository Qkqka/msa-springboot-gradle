package com.msa.service;

import com.msa.domain.GithubUserResponseDomain;

public interface TestService {

    public GithubUserResponseDomain getGithubUser(String githubId);

}
