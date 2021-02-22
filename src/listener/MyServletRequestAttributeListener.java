package com.nero.java.jsp.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

/**
 * 监听servlet request中属性的改变(增删改)
 */
public class MyServletRequestAttributeListener implements ServletRequestAttributeListener {
    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("servlet request attribute added " + srae.getName() + "=" + srae.getValue());
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("servlet request attribute removed " + srae.getName() + "=" + srae.getValue());
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("servlet request attribute replaced " + srae.getName() + "=" + srae.getValue());
    }
}
