package com.jyjz.playground.filter;

import javax.servlet.*;
import java.io.IOException;

public class OuterFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("before chain.doFilter(request, response) in OuterFilter");
        chain.doFilter(request, response);
        System.out.println("after chain.doFilter(request, response) in OuterFilter");
    }

    @Override
    public void destroy() {

    }
}
