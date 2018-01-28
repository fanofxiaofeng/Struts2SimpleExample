package com.jyjz.playground.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class NaiveServletContextAttributeListener implements ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent scab) {
        System.out.println("新增属性");
        System.out.println("name of attribute is: " + scab.getName());
        System.out.println("value is: " + scab.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scab) {
        System.out.println("删除属性");
        System.out.println("name of attribute is: " + scab.getName());
        System.out.println("value is: " + scab.getValue());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scab) {
        System.out.println("替换属性的值");
        System.out.println("name of attribute is: " + scab.getName());
        System.out.println("value is: " + scab.getValue());
    }
}
