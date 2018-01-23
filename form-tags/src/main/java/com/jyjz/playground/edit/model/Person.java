package com.jyjz.playground.edit.model;

import com.google.gson.Gson;

import java.util.Arrays;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String sport;
    private boolean over21;
    private String gender;
    private String residency;
    private String[] carModels;

    public Person() {
        System.out.println("Person 的构造函数被调用");
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

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getResidency() {
        return residency;
    }

    public void setResidency(String residency) {
        this.residency = residency;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isOver21() {
        return over21;
    }

    public void setOver21(boolean over21) {
        this.over21 = over21;
    }

    public String[] getCarModels() {
        return carModels;
    }

    public void setCarModels(String[] carModels) {
        System.out.println("setCarModels is called with: " + Arrays.toString(carModels));
        this.carModels = carModels;
    }
}
