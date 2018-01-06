package com.jyjz.playground.model;

public class MessageStore {
    private String message;

    public MessageStore() {
        message = "Hello Struts User";
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "MessageStore 被转化为 String";
    }
}