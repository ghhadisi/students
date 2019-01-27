package com.hss.student.setvlets;

import com.hss.student.entity.CityBean;
import net.sf.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DataJsonServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
//        String name = req.getParameter("name").trim();

        List<CityBean> list = CityBean.cityList();

        JSONArray jsonArray = JSONArray.fromObject(list);
        String json = jsonArray.toString();


        resp.setContentType("text/html;charset=utf-8");

        resp.getWriter().write(json);
    }

    /*
    *
    * //再遍历，追加
        $(data).each(function(index , c) {
            $("#city").append("<option value='"+c.id+"' >"+c.cname)
        });
    *
    * */
}
