package com.hss.student.filter;

import javax.servlet.*;
import java.io.IOException;

public class Filter1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.err.println("过滤器创建了...");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.err.println("来到过虑器了filter01。。。");
        filterChain.doFilter(servletRequest, servletResponse);
        System.err.println("来到过虑器了filter01。。。");
    }

    @Override
    public void destroy() {
        System.err.println("过滤器销毁了...");

    }
}
