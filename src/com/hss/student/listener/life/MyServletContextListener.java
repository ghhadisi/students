package com.hss.student.listener.life;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.err.println("servletContext 初始化了...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.err.println("servletContext 销毁了...");

    }
}
