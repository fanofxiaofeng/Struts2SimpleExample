package com.jyjz.playground.wildcardmethod.service;

import com.jyjz.playground.wildcardmethod.model.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PersonService {
    /**
     * Person 的列表
     */
    private static List<Person> personList = new ArrayList<>();

    static {
        personList.add(new Person(personList.size(), "秉初", "赵"));
        personList.add(new Person(personList.size(), "辅国", "钱"));
        personList.add(new Person(personList.size(), "求索", "孙"));
        personList.add(new Person(personList.size(), "如玉", "李"));
    }

    /**
     * 获取 Person 的列表
     */
    public static List<Person> getPersons() {
        return personList;
    }

    /**
     * 在 Person 列表末尾加入一个 person
     *
     * @param person 待加入者
     */
    public static void addPerson(Person person) {
        person.setId(personList.size());
        personList.add(person);
    }

    /**
     * 从 Person 列表的指定的下标位置删除一个元素
     *
     * @param id 指定的下标位置
     */
    public static void deletePerson(int id) {
        List<Person> remain = new LinkedList<>();
        for (Person person : personList) {
            if (person.getId() != id) {
                remain.add(person);
            }
        }
        personList = remain;
        resetIds();
    }

    public static void updatePerson(Person givenPerson) {
        List<Person> updated = new LinkedList<>();
        for (Person person : personList) {
            if (person.getId() == givenPerson.getId()) {
                updated.add(givenPerson);
            } else {
                updated.add(person);
            }
        }
        personList = updated;
    }

    public static Person queryPersonById(int id) {
        if (id >= 0 && id < personList.size()) {
            return personList.get(id);
        }
        return new Person();
    }

    private static void resetIds() {
        int pos = 0;
        for (Person person : personList) {
            person.setId(pos++);
        }
    }
}
