package com.hss.student.setvlets;

import com.hss.student.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class KeyWordsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String word = req.getParameter("keyword");
        List<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("bbb");
        list.add("cccc");
        req.setAttribute("list",list);
        resp.setContentType("text/html;charset=utf-8");

        req.getRequestDispatcher("/jsp/keywords.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
