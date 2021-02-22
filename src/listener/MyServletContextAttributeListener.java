package com.nero.java.jsp.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * 监听Servlet Context attribute的增删改
 */
public class MyServletContextAttributeListener implements ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("servlet context attribute added " + event.getName() + "=" + event.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("servlet context attribute removed " + event.getName() + "=" + event.getValue());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        System.out.println("servlet context attribute replaced " + event.getName() + "=" + event.getValue());
    }
}
