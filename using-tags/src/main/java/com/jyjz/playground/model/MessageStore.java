package com.jyjz.playground.model;

import com.google.gson.Gson;

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
        return new Gson().toJson(this);
    }
}