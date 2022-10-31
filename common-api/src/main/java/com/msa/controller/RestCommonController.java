package com.msa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msa.domain.GithubUserResponseDomain;
import com.msa.service.CommonCodeService;
import com.msa.service.TestService;

@RestController
@RequestMapping("/cmm")
public class RestCommonController {

    @Autowired
    private CommonCodeService commonCodeService;

    @Autowired
    private TestService testService;

    @GetMapping()
    public String test() {
        return "WELCOMEsss";
    }

    @GetMapping("/greeting")
    public String greeting() {
        return "WELCOME";
    }

    @GetMapping("/users/{githubId}")
    public GithubUserResponseDomain getGithubUser(@PathVariable String githubId) {
        return this.testService.getGithubUser(githubId);
    }

    @GetMapping("/code/list")
    public List<String> getCodeList() {
        return this.commonCodeService.selectCodeList();
    }

    @GetMapping("/code/{codeId}")
    public String getCode(@PathVariable String codeId) {
        return this.commonCodeService.selectCode(codeId);
    }
}
