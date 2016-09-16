package com.os.servlet;

import com.os.biz.DoSomethingBiz;

import java.io.IOException;

/**
 * Created by oswaldl(418336572@qq.com) on 4/10/16.
 */
public class TestServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.getWriter().write("hi");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.getWriter().write(DoSomethingBiz.instance.Working());
    }
}
