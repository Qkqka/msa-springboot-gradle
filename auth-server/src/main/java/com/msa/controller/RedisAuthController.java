package com.msa.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.msa.domain.Login;
import com.msa.service.AuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class RedisAuthController {

    private final AuthService authService;

    @GetMapping("/getSessionId")
    public String getSessionId(HttpSession session) {
        return "id: " + session.getId() + ", value: " + session.getAttribute(session.getId());
    }

    @PostMapping("/login")
    public String login(HttpSession session, @RequestBody Login login) {
        String result = this.authService.login(login);
        log.info("\n\nsession: {}", session);
        log.info("\n\nlogin: {}", login);
        return result;
    }

    @PostMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return "!로그아웃!";
    }
}
