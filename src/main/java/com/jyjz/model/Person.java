package com.jyjz.model;

import com.google.gson.Gson;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String sport;
    private String gender;
    private String residency;
    private boolean over21;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("年龄被设置为: " + age);
        this.age = age;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public Person() {
        System.out.println("Person 的构造函数被调用了");
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        System.out.println("setSport() 函数的入参为: " + sport);
        this.sport = sport;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public String getResidency() {
        return residency;
    }

    public void setResidency(String residency) {
        this.residency = residency;
    }

    public boolean isOver21() {
        return over21;
    }

    public void setOver21(boolean over21) {
        this.over21 = over21;
    }
}
