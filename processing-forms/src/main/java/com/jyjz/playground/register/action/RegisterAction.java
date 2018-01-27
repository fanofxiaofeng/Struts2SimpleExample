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
        // User must provide a first name
        if (personBean.getFirstName().length() == 0) {
            addFieldError("personBean.firstName", "First name 必须填写");
        }

        // User must provide an email address
        if (personBean.getEmail().length() == 0) {
            addFieldError("personBean.email", "email 必须填写");
        }

        // User younger than 18 cannot register
        if (personBean.getAge() < 18) {
            addFieldError("personBean.age", "年龄至少要达到18岁");
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
