package com.jyjz.playground.register.action;

import com.google.gson.Gson;
import com.jyjz.playground.register.exception.BadLuckException;
import com.jyjz.playground.register.model.Person;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
    private Person personBean;

    public RegisterAction() {
        System.out.println("RegisterAction 构造函数被调用");
    }

    @Override
    public void validate() {
        System.out.println("validate 函数被调用");
    }

    public void triggerBadLuckException() throws BadLuckException {
        System.out.println("triggerBadLuckException 被执行喽");
        throw new BadLuckException();
    }

    public void triggerArrayIndexOutOfBoundsException() throws ArrayIndexOutOfBoundsException {
        System.out.println("triggerArrayIndexOutOfBoundsException 被执行喽");
        throw new ArrayIndexOutOfBoundsException();
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
