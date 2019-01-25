package com.hss.student.setvlets;

import com.hss.student.entity.Student;
import com.hss.student.service.StudentService;
import com.hss.student.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class StudentDetailServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sid = req.getParameter("sid");
        StudentService studentService = new StudentServiceImpl();
        try {
            Student student = studentService.findStudentById( Integer.parseInt(sid));

            req.setAttribute("stu", student);
            req.getRequestDispatcher("./jsp/student_update.jsp").forward(req,resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
