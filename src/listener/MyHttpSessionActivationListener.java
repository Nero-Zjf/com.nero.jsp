package com.nero.java.jsp.listener;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * 监听http session的活化和钝化
 *
 * 所谓钝化，其实就是序列化操作（对象转换为字节序列），由内存写入到硬盘；
 * 所谓活化，就是反序列化（字节序列转换成对象），指的是从硬盘到内存的过程。
 */
public class MyHttpSessionActivationListener implements HttpSessionActivationListener {
    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {
        System.out.println("http session " + se.getSession().getId() + " will passive");
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent se) {
        System.out.println("http session " + se.getSession().getId() + " did activate");
    }
}
