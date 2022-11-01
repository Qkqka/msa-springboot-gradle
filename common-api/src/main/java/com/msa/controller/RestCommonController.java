package com.msa.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msa.domain.Code;
import com.msa.domain.GithubUserResponseDomain;
import com.msa.service.CommonCodeService;
import com.msa.service.TestService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/cmm")
@RequiredArgsConstructor
public class RestCommonController {

    private final CommonCodeService commonCodeService;

    private final TestService testService;

    @GetMapping("/getSessionId")
    public String getSessionId(HttpSession session) {
        return session.getId();
    }

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
    public List<Code> getCodeList() {
        return this.commonCodeService.selectCodeList();
    }

    @GetMapping("/code/{codeId}")
    public Code getCode(@PathVariable String codeId) throws Exception {
        return this.commonCodeService.selectCode(codeId);
    }
}
