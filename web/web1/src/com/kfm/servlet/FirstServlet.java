package com.kfm.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author Administrator
 */
public class FirstServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println(" Servlet init ");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println(" Servlet service");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println(" Servlet destroy ");
    }
}
