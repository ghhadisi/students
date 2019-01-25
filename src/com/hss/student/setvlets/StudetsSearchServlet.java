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
import java.util.List;

public class StudetsSearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        try {

            String sname = req.getParameter("sname");
            String sgender = req.getParameter("sgender");
            System.err.println("sname = "+sname+"  sgender = "+sgender);

            //1. 查询出来所有的学生
            StudentService service = new StudentServiceImpl();
            List<Student> list = service.searchStudent(sname,sgender);
            for (Student student : list) {
                System.out.println("stu="+student);
            }
            //2. 先把数据存储到作用域中
            req.setAttribute("list", list);
            //3. 跳转页面
            req.getRequestDispatcher("./jsp/student_search_list.jsp").forward(req, resp);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
