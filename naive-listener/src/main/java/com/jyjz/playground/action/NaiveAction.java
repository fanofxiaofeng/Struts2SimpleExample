package com.jyjz.playground.action;

import com.opensymphony.xwork2.ActionSupport;

public class NaiveAction extends ActionSupport {
    @Override
    public String execute() {
        for (int i = 0; i < 5; i++) {
            System.out.println("");
        }
        return SUCCESS;
    }
}
