package com.hss.student.listener.life;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletRequestListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.err.println("servletrequest 销毁了");

    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.err.println("servletrequest 初始化了");

    }
}
