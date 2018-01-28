package com.jyjz.playground.filter;

import org.apache.commons.lang3.math.NumberUtils;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ShowCookiesFilter implements Filter {
    private final static String NAME = "naive_counter";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        Cookie[] cookies = ((HttpServletRequest) request).getCookies();
        boolean found = false;
        Cookie tempCookie = new Cookie(NAME, "1");
        if (cookies == null) {
            System.out.println("cookies is null");
            cookies = new Cookie[0];
        }
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName());
            System.out.println(cookie.getValue());
            if (cookie.getName().equals(NAME)) {
                found = true;
                tempCookie = cookie;
            }
        }

        tempCookie.setMaxAge(20);
        if (found) {
            int oldValue = NumberUtils.toInt(tempCookie.getValue());
            tempCookie.setValue("" + (oldValue + 1));
        }
        ((HttpServletResponse) response).addCookie(tempCookie);
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
