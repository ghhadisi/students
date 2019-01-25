package com.hss.student.setvlets;

import com.hss.student.entity.Student;
import com.hss.student.service.StudentService;
import com.hss.student.service.impl.StudentServiceImpl;
import com.hss.student.utils.TextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

public class StudentUpdateServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.err.println("StudentUpdateServlet");
        req.setCharacterEncoding("UTF-8");
        //1. 获取客户端提交上来的数据
        String sid = req.getParameter("sid").trim();
        String sname = req.getParameter("sname").trim(); //sname:zhangsan
        System.err.println(sname);
        String gender = req.getParameter("gender").trim();
        String phone = req.getParameter("phone").trim();
        String birthday = req.getParameter("birthday").trim(); // 1989-10-18
        String info = req.getParameter("info").trim();
        String hobby = req.getParameter("hobby").trim();//hobby : 游泳，写字， 足球。
//        String [] h  = req.getParameterValues("hobby").trim();
        StudentService studentService = new StudentServiceImpl();

        Student student = new Student();

        student.setSname(sname);
        student.setGender(gender);
        student.setPhone(phone);
        if (!TextUtils.isEmpty(birthday)){
            try {
                Date date= new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
                student.setBirthday(date);

            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
        student.setInfo(info);
        student.setHobby(hobby);
        if (TextUtils.isEmpty(sid)){
            try {
                studentService.insert(student);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else {
            System.err.println(sid);
            student.setSid(Integer.parseInt(sid.trim()));
            try {
                studentService.update(student);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
//        req.getRequestDispatcher("studetsSearch").forward(req,resp);
        req.getRequestDispatcher("./jsp/student_search_list.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
