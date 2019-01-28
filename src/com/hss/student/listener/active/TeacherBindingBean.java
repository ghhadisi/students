package com.hss.student.listener.active;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
/*
* > 这一类监听器不用注册。

* HttpSessionBindingListener

> 监听对象与session 绑定和解除绑定 的动作
* */
public class TeacherBindingBean implements HttpSessionBindingListener{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.err.println("对象被绑定进来了");

    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.err.println("对象被解除绑定");

    }
}
