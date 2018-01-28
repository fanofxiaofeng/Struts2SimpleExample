package com.jyjz.playground.action;

import com.opensymphony.xwork2.ActionSupport;

public class CheckAction extends ActionSupport {
    private String something = "";

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }
}
