package com.jyjz.playground.wildcardmethod.model;

import com.google.gson.Gson;

public class Person {
    private int id;
    private String firstName;
    private String lastName;

    public Person() {
        this.id = -1;
        this.firstName = null;
        this.lastName = null;
    }

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
