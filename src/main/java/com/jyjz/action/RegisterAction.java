package com.jyjz.action;

import com.jyjz.model.Person;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;

public class RegisterAction extends ActionSupport {
    private Person personBean;

//    {
//        personBean = new Person();
//        personBean.setFirstName("测试用的firstName");
//        personBean.setLastName("测试用的lastName");
//    }

    @Override
    public String execute() throws Exception {
        System.out.println("RegisterAction 的 execute() 方法被调用");
//        if (Math.random() < 2.5) {
//            throw new ArrayIndexOutOfBoundsException();
//        }
        return SUCCESS;
    }

    @Override
    public void validate() {
        if (StringUtils.isEmpty(personBean.getFirstName())) {
            addFieldError("personBean.firstName", "First name is required.");
        }

        if (StringUtils.isEmpty(personBean.getEmail())) {
            addFieldError("personBean.email", "Email is required.");
        }

        if (personBean.getAge() < 18) {
            addFieldError("personBean.age", "Age is required and must be 18 or older");
        }

    }

    public Person getPersonBean() {
        return personBean;
    }

    public void setPersonBean(Person personBean) {
        this.personBean = personBean;
    }
}
