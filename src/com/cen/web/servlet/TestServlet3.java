package com.cen.web.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author:cen
 * @date:2019/9/19
 * @Description:${PACKAGE_NAME}
 * @version:1.0
 */
@WebServlet("/TestServlet3")
public class TestServlet3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        ServletConfig servletConfig =this.getServletConfig();

        //获取参数名为encoding对应的参数值
        String param = servletConfig.getInitParameter("encoding");
        out.write("encoding:"+param);
    }
}
