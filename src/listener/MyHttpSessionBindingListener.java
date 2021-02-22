package com.nero.java.jsp.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * 监控当前类的对象与http session绑定或解除绑定
 * 注意：此监听器不需要在web.xml注册
 * 绑定是指定通过HttpSession.setAttribute方法将实现了HttpSessionBindingListener的对象设置为HttpSession的属性
 * 解绑则是相反，通过HttpSession.removeAttribute或HttpSession.setAttribute("key",其他对象)
 */
public class MyHttpSessionBindingListener implements HttpSessionBindingListener {
    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        String sessionId = event.getSession().getId();
        System.out.println("http session " + sessionId + " valueBound name=" + event.getName() + " value=" + event.getValue());
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        String sessionId = event.getSession().getId();
        System.out.println("http session " + sessionId + " valueUnBound name=" + event.getName() + " value=" + event.getValue());
    }
}
