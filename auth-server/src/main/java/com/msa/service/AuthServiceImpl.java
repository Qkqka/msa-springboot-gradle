package com.msa.service;

import com.msa.domain.Login;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService{
    @Override
    public String login(Login login) {
        if (login == null) {
            throw new NullPointerException("로그인 정보가 존재하지 않습니다.");
        }

        if (!StringUtils.equals("loginId", login.getId())) {
            return "아이디를 다시 확인해주세요.";
        }

        if (!StringUtils.equals("loginPw", login.getPassword())) {
            return "비밀번호를 다시 확인해주세요.";
        }

        return "!로그인!";
    }
}
