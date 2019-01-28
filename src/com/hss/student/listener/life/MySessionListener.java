package com.hss.student.listener.life;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.Enumeration;

public class MySessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.err.println("创建session了");
        HttpSession session =se.getSession();
        System.err.println("sessinId = "+session.getId());

        Enumeration<String> enumeration  =session.getAttributeNames();
        while (enumeration.hasMoreElements()){
            System.err.println("AttributeName = "+enumeration.nextElement());

        }
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.err.println("销毁session了");

    }
}
