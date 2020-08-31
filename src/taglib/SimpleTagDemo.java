package com.nero.java.jsp.taglib;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * @created nero
 * @date 2018/9/13 11:45
 */
public class SimpleTagDemo extends SimpleTagSupport {
    private String title;

    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().getOut().print("title is "+title +"\n");
        getJspBody().invoke(null);
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
