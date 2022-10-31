package com.msa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msa.domain.GithubUserResponseDomain;
import com.msa.service.CommonService;

@RestController
@RequestMapping("/cmm")
public class RestCommonController {

    @Autowired
    private CommonService commonService;

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
        return this.commonService.getGithubUser(githubId);
    }

    @GetMapping("/code/list")
    public List<String> getCodeList() {
        return this.commonService.selectCodeList();
    }

    @GetMapping("/code/{codeId}")
    public String getCode(@PathVariable String codeId) {
        return this.commonService.selectCode(codeId);
    }
}
