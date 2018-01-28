package com.jyjz.playground.filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

public class ParameterFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        Enumeration parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String parameterName = (String) parameterNames.nextElement();
            System.out.println("parameterName: " + parameterName);
            String value = request.getParameter(parameterName);
            System.out.println("value: " + value);
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
