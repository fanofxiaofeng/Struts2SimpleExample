package com.jyjz.playground.edit.service;

import com.jyjz.playground.edit.model.Person;

public class EditServiceImpl implements EditService {
    private Person person = new Person();

    {
        person.setFirstName("Jon");
        person.setLastName("Snow");
        person.setEmail("x@y.edu");
        person.setPhoneNumber("123-456-7890");
//        person.setGender("male");
//        person.setSport("ping-pong");
    }

    @Override
    public Person getPerson() {
        return person;
    }
}
