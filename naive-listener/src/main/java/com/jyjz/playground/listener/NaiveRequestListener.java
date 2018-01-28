package com.jyjz.playground.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class NaiveRequestListener implements ServletRequestListener{
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("requestDestroyed() of NaiveRequestListener is called");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("requestInitialized() of NaiveRequestListener is called");
    }

}
