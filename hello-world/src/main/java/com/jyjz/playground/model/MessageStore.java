package com.jyjz.playground.model;

public class MessageStore {
    private String message;

    public MessageStore() {
        message = "可爱的 Struts 用户, 你好";
    }

    public String getMessage() {
        System.out.println("getMessage 被调用");
        return message;
    }
}