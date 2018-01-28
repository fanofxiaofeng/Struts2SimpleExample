package com.jyjz.playground.model;

import com.google.gson.Gson;

public class PlaceHolder {
    private boolean success;
    private String message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PlaceHolder() {
    }

    public PlaceHolder(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
