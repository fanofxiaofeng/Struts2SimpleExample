package com.jyjz.playground.filter;

import javax.servlet.*;
import java.io.IOException;


public class NaiveFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("In init() of NaiveFilter.");
        String value1 = filterConfig.getInitParameter("key1");
        String value2 = filterConfig.getInitParameter("key2");
        System.out.println(String.format("key1 -> %s", value1));
        System.out.println(String.format("key2 -> %s", value2));
        System.out.println(filterConfig.getFilterName());
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("In doFilter() of NaiveFilter.");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
