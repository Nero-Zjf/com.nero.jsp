package com.nero.java.jsp.listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 监听http session的创建和销毁
 */
public class MyHttpSessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        System.out.println("session created " + session.getId());
        MyHttpSessionBindingListener myHttpSessionBindingListener = new MyHttpSessionBindingListener();
        session.setAttribute("bindingListener", myHttpSessionBindingListener);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        System.out.println("session destroyed " + session.getId());
    }
}
