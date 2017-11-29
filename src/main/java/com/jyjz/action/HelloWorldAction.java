package com.jyjz.action;

import com.jyjz.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
    private String userName;
    private static int helloCount = 0;
    private MessageStore messageStore;

    public int getHelloCount() {
        return helloCount;
    }

    @Override
    public String execute() {
        messageStore = new MessageStore();
        messageStore.setMessage("Hello, " + userName);
        System.out.println("userName: " + userName);
        helloCount++;
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        System.out.println("setUserName() method is called");
        this.userName = userName;
    }
}
