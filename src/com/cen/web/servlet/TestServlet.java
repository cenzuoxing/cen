package com.cen.web.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;


/**
 * @author:cen
 * @date:2019/9/19
 * @Description:com.cen.web.servlet
 * @version:1.0
 */
public class TestServlet extends GenericServlet {
    @Override
    public void destroy() {

        System.out.println("我被销毁了");
    }

    @Override
    public void init() throws ServletException {
       System.out.println("初始化的我");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("nihao");
    }
}
