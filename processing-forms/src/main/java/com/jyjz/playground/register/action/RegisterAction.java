package com.jyjz.playground.register.action;

import com.google.gson.Gson;
import com.jyjz.playground.register.model.Person;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
    private Person personBean;

    public RegisterAction() {
        System.out.println("RegisterAction 构造函数被调用");
    }

    @Override
    public void validate() {
        if (personBean.getFirstName().length() == 0) {
            addFieldError("personBean.firstName", "First name is required.");
        }
    }

    public Person getPersonBean() {
        System.out.println("getPersonBean in RegisterAction 被调用");
        System.out.println(new Gson().toJson(personBean));
        return personBean;
    }

    public void setPersonBean(Person personBean) {
        System.out.println("setPersonBean in RegisterAction 被调用");
        System.out.println(new Gson().toJson(personBean));
        this.personBean = personBean;
    }
}
