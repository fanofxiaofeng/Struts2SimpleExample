package com.jyjz.playground;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class SimpleServlet extends HttpServlet {
    private ServletConfig servletConfig;

    @Override
    public void init(ServletConfig servletConfig) {
        this.servletConfig = servletConfig;
        System.out.println("init() in SimpleServlet is called");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println(request.getContextPath());
        temp(response, "doGet()");
    }

    private void temp(HttpServletResponse response, String info) throws IOException {
        String value1 = this.servletConfig.getInitParameter("key1");
        String value2 = this.servletConfig.getInitParameter("key2");
        System.out.println("value1 is: " + value1);
        System.out.println("value2 is: " + value2);

        response.setContentType("text/html");
//        response.setStatus(302);
//        response.setHeader("Location", "http://www.baidu.com");

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>naive servlet</title>");
        out.println("</head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>");
        out.println(String.format("This is %s in: " + this.getClass().toString(), info));
        Enumeration a = servletConfig.getInitParameterNames();
        if (a.hasMoreElements()) {
            out.println("<table border=\"5px\">");
            while (a.hasMoreElements()) {
                String key = (String) a.nextElement();
                String value = servletConfig.getInitParameter(key);
                out.println("<tr>");
                out.println("<td>");
                out.println(key);
                out.println("</td>");
                out.println("<td>");
                out.println(value);
                out.println("</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("<hr/>");
        }

        ServletContext context = servletConfig.getServletContext();
        Enumeration b = context.getInitParameterNames();
        if (b.hasMoreElements()) {
            out.println("<table border=\"5px\">");
            while (b.hasMoreElements()) {
                String key = (String) b.nextElement();
                String value = context.getInitParameter(key);
                out.println("<tr>");
                out.println("<td>");
                out.println(key);
                out.println("</td>");
                out.println("<td>");
                out.println(value);
                out.println("</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("<hr/>");
        }


        out.println("</p>");
        out.println("</body>");
        out.println("</html>");
        out.flush();
        out.close();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        temp(response, "doPost()");
    }
}