package com.jyjz.action;

import com.jyjz.model.Person;
import com.jyjz.model.State;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EditAction extends ActionSupport {
    private Person personBean;

    private List<String> sports = Arrays.asList("football", "baseball", "basketball", "书法");

    private List<String> genders = Arrays.asList("male", "female", "not sure");

    private List<State> states;
    {
        personBean = new Person();
        personBean.setFirstName("fff");
        personBean.setLastName("lll");
//        personBean.setSport();
    }

    @Override
    public String execute() {
        System.out.println("execute() in class EditAction");
        return SUCCESS;
    }

    public Person getPersonBean() {
        return personBean;
    }

    public void setPersonBean(Person personBean) {
        this.personBean = personBean;
    }

    public List<String> getSports() {
        return sports;
    }

    public List<String> getGenders() {
        return genders;
    }

    public List<State> getStates() {
        states = new ArrayList<State>();
        State s1 = new State();
        s1.setStateAbbr("AZ");
        s1.setStateName("Arizona");
        states.add(s1);

        State s2 = new State();
        s2.setStateAbbr("CA");
        s2.setStateName("California");
        states.add(s2);
        for (int i = 3; i < 100; i++) {
            State state = new State();
            state.setStateAbbr("abbr" + i);
            state.setStateName("name" + i);
            states.add(state);
        }
        return states;
    }
}
