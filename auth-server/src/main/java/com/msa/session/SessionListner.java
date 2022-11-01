package com.msa.session;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListner implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        se.getSession().setMaxInactiveInterval(60*5); // 5분
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    }

}
