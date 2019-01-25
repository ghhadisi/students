package com.hss.student.setvlets;

import com.hss.student.service.StudentService;
import com.hss.student.service.impl.StudentServiceImpl;
import com.hss.student.utils.TextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class StudetDeleteServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sid =req.getParameter("sid").trim();
        if (!TextUtils.isEmpty(sid)){
            StudentService studentService = new StudentServiceImpl();
            try {
                studentService.delete(Integer.parseInt(sid));

                req.getRequestDispatcher("studetsSearch").forward(req,resp);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
