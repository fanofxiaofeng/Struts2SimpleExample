package com.jyjz.playground.wildcardmethod.action;

import com.google.gson.Gson;
import com.jyjz.playground.wildcardmethod.model.Person;
import com.jyjz.playground.wildcardmethod.service.PersonService;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class PersonAction extends ActionSupport {
    private List<Person> personList = PersonService.getPersons();

    /**
     * 当前要处理的 Person
     */
    private Person person;

    private int id;

    private static final String EDIT = "edit";

    @Override
    public String input() {
        System.out.println("in input()");
        return INPUT;
    }

    public String delete() {
        System.out.println("id is: " + id);
        PersonService.deletePerson(id);
        personList = PersonService.getPersons();
        return SUCCESS;
    }

    public String edit() {
        person = PersonService.queryPersonById(id);
        return EDIT;
    }

    public String save() {
        System.out.println("person is: " + person.toString());
        PersonService.updatePerson(person);
        personList = PersonService.getPersons();
        return SUCCESS;
    }

    public String create() {
        PersonService.addPerson(person);
        return SUCCESS;
    }

    public String query() {
        person = PersonService.queryPersonById(id);
        return SUCCESS;
    }

    public List<Person> getPersonList() {
        System.out.println("in getPersonList()...");
        System.out.println(new Gson().toJson(personList));
        return personList;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
