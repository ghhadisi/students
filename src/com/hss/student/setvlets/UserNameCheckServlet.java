package com.hss.student.setvlets;


import com.hss.student.service.UserService;
import com.hss.student.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class UserNameCheckServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name").trim();
        System.err.println(name);
        UserService userService = new UserServiceImpl();
        resp.setContentType("text/html;charset=utf-8");

        boolean flag = false;
        try {
            flag = userService.checkUserNameExist(name);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resp.getWriter().write(flag?"1":"0");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
