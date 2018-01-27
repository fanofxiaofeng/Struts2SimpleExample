package com.jyjz.playground.action;

import com.jyjz.playground.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
    private MessageStore messageStore;

    private static int count = 0;

    private String userName;

    public HelloWorldAction() {
        super();
        count++;
    }

    @Override
    public String execute() {
        messageStore = new MessageStore();
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public int getCount() {
        return count;
    }

    public String getUserName() {
        System.out.println("getUserName 方法被调用, with parameter userName: " + userName);
        return userName;
    }

    public void setUserName(String userName) {
        System.out.println("setUserName 方法被调用, with parameter userName: " + userName);
        this.userName = userName;
    }
}
