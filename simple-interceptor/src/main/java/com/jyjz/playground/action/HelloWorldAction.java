package com.jyjz.playground.action;

import com.jyjz.playground.model.Person;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
    private String userName;
    private Person person;
    private static int helloCount = 0;

    public int getHelloCount() {
        return helloCount;
    }

    @Override
    public String execute() {
        System.out.println("userName: " + userName);
        helloCount++;
        return SUCCESS;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        System.out.println("setUserName() method is called");
        this.userName = userName;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        System.out.println("\n\n\n\n\n\n\nsetPerson() is called!!!!\n\n\n\n\n");
        this.person = person;
    }
}
