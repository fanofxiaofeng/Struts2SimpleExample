package com.jyjz.playground.helloworld.action;

import com.jyjz.playground.helloworld.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
    private MessageStore messageStore;

    private static int count = 0;

    private String userName;

    public HelloWorldAction() {
        super();
        System.out.println("HelloWorldAction 的构造函数被调用一次");
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
