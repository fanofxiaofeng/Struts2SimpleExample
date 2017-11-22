package com.jyjz.action;

import com.jyjz.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
    private static int helloCount = 0;
    private MessageStore messageStore;

    public int getHelloCount() {
        return helloCount;
    }

    @Override
    public String execute() {
        messageStore = new MessageStore();
        messageStore.setMessage("Hello, someone");
        helloCount++;
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
}
