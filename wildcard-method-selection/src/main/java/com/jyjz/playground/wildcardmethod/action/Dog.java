package com.jyjz.playground.wildcardmethod.action;

import com.opensymphony.xwork2.ActionSupport;

public class Dog extends ActionSupport {
    private String name = "天地玄黄";
    private String[] fruits = {"苹果", "梨", "葡萄", "橘子", "菠萝"};

    public String getName() {
        return name;
    }

    public String[] getFruits() {
        return fruits;
    }
}
