package com.nero.java.jsp.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 监听Servlet Context的初始化和销毁
 */
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("servlet context initialized "+ sce.getServletContext());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("servlet context destroyed "+ sce.getServletContext());
    }
}
