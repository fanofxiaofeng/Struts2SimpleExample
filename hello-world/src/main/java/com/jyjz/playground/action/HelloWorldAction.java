package com.jyjz.playground.action;

import com.jyjz.playground.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
    private MessageStore messageStore;

    @Override
    public String execute() {
        messageStore = new MessageStore();
        System.out.println("execute() in HelloWorldAction 执行一次");

        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
}
