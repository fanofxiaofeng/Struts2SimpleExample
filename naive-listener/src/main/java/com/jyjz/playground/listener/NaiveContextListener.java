package com.jyjz.playground.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class NaiveContextListener implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("contextInitialized() of NaiveListener is called");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("contextDestroyed() of NaiveListener is called");
    }
}
