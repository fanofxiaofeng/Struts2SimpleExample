package com.jyjz.playground;

public class MessageStore {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MessageStore 类的 toString() 的返回值";
    }

    public MessageStore() {
        System.out.println("MessageStore 的构造函数被调用");
    }

    public static void main(String[] args) {
      System.out.println("试试效果");
    }
}
