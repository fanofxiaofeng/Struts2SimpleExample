package com.jyjz.playground.edit.action;

import com.google.gson.Gson;
import com.jyjz.playground.edit.model.Person;
import com.jyjz.playground.edit.model.State;
import com.jyjz.playground.edit.service.EditService;
import com.jyjz.playground.edit.service.EditServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

import java.util.LinkedList;
import java.util.List;

public class UpdateAction extends ActionSupport {
    private Person personBean;

    private EditService editService = new EditServiceImpl();

    private String[] sports = {"ping-pong", "basketball", "football"};

    private String[] genders = {"male", "female", "not sure"};

    private List<State> states = new LinkedList<>();

    private String[] carModelsAvailable = {"Toyota", "Nissan", "Ford"};

    {
        states.add(new State("AZ", "Arizona"));
        states.add(new State("CA", "California"));
        states.add(new State("FL", "Florida"));
        states.add(new State("KS", "Kansas"));
        states.add(new State("NY", "New York"));
    }

    public UpdateAction() {
        System.out.println("UpdateAction 构造函数被调用");
    }

    @Override
    public String execute() {
        return SUCCESS;
    }

    @Override
    public String input() {
        // 假装已有填写好的数据
        setPersonBean(editService.getPerson());
        return INPUT;
    }

    public Person getPersonBean() {
        System.out.println("getPersonBean in UpdateAction 被调用");
        System.out.println(new Gson().toJson(personBean));
        return personBean;
    }

    public void setPersonBean(Person personBean) {
        System.out.println("setPersonBean in UpdateAction 被调用");
        System.out.println(new Gson().toJson(personBean));
        this.personBean = personBean;
    }

    public String[] getSports() {
        return sports;
    }

    public String[] getGenders() {
        return genders;
    }

    public List<State> getStates() {
        return states;
    }

    public String[] getCarModelsAvailable() {
        return carModelsAvailable;
    }
}
