package com.jyjz.playground.action;

import com.jyjz.playground.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
    private static int INSTANCE_COUNTER = 0;
    private MessageStore messageStore;

    public HelloWorldAction() {
        super();
        System.out.println("HelloWorldAction 类的构造函数执行一次");
        System.out.println(String.format("HelloWorldAction 类创建了 %s 个实例", ++INSTANCE_COUNTER));
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
