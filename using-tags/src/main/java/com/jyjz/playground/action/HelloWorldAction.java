package com.jyjz.playground.action;

import com.jyjz.playground.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
    private MessageStore messageStore;

    private static int count = 0;

    public HelloWorldAction() {
        super();
        for (int i = 0; i < 10; i++) {
            System.out.println("\n");
        }
        System.out.println("HelloWorldAction 的构造函数被调用一次");
        for (int i = 0; i < 10; i++) {
            System.out.println("\n");
        }
    }

    @Override
    public String execute() {
        messageStore = new MessageStore();
        System.out.println("execute() in HelloWorldAction 执行一次");
        System.out.println(count);
        count++;
        System.out.println(count);
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public int getCount() {
        return count;
    }
}
