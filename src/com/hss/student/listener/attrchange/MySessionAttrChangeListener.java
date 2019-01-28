package com.hss.student.listener.attrchange;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
/*
*
* * servletContext --- ServletContextAttributeListener
![icon](img/img03.png)

* request --- ServletRequestAttributeListener
![icon](img/img04.png)

* session --- HttpSessionAttributeListener
![icon](img/img02.png)
* */
public class MySessionAttrChangeListener implements HttpSessionAttributeListener {

    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        System.err.println("属性被添加进来了");

    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        System.err.println("属性被移除了");

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        System.err.println("属性被替换了");

    }
}
