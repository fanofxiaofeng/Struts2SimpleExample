package com.jyjz.playground.action;

import com.jyjz.playground.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
    private MessageStore messageStore;

    public HelloWorldAction() {
        super();
        System.out.println("HelloWorldAction 类的构造函数执行一次");
    }

    @Override
    public String execute() {
        messageStore = new MessageStore();
        System.out.println("execute() in HelloWorldAction 执行一次");

        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        System.out.println("getMessageStore 被调用");
        return messageStore;
    }
}
