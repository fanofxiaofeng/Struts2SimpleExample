package com.jyjz.playground.filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

public class InnerFilter implements Filter {

    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("before chain.doFilter(request, response) in InnerFilter");

        printFilterName();
        printParameters();

        chain.doFilter(request, response);

        System.out.println("after chain.doFilter(request, response) in InnerFilter");
    }

    private void printFilterName() {
        System.out.println(String.format("The name of this filter: [%s]", filterConfig.getFilterName()));
    }

    private void printParameters() {
        Enumeration e = filterConfig.getInitParameterNames();
        while (e.hasMoreElements()) {
            String key = (String) e.nextElement();
            String value = filterConfig.getInitParameter(key);
            System.out.println(String.format("# [%s] -> [%s]", key, value));
        }
    }

    @Override
    public void destroy() {

    }
}
