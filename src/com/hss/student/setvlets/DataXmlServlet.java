package com.hss.student.setvlets;

import com.hss.student.entity.CityBean;
import com.thoughtworks.xstream.XStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DataXmlServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
//        String name = req.getParameter("name").trim();

        List<CityBean> list = CityBean.cityList();
        //3. 返回数据。手动拼  ---> XStream  转化 bean对象成 xml
        XStream xStream = new XStream();

        //想把id做成属性
//        xStream.useAttributeFor(CityBean.class, "id");
        // <com.hss.student.entity.CityBean>
        //    <id>1</id>
        //    <pid>1</pid>
        //    <cname>aaaa</cname>
        //  </com.hss.student.entity.CityBean>

        //设置别名
        xStream.alias("city", CityBean.class);
        //不设置alais <com.hss.student.entity.CityBean>

        //转化一个对象成xml字符串
        String xml = xStream.toXML(list);

        resp.getWriter().write(xml);
    }

/*
    //遍历一个city，就执行一次function方法
    $(data).find("city").each(function() {

        //遍历出来的每一个city，取它的孩子。 id , cname
        var id = $(this).children("id").text();
        var cname = $(this).children("cname").text();

        $("#city").append("<option value='"+id+"' >"+cname)
    });

    */

}
