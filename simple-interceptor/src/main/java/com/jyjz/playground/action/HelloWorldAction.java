package com.jyjz.playground.action;

import com.jyjz.playground.model.Person;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HelloWorldAction extends ActionSupport {
    private String userName;
    private Person person;
    private static int helloCount = 0;
    private File test;
    private String testFileName;
    private String testContentType;

    public int getHelloCount() {
        return helloCount;
    }

    @Override
    public String execute() {
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        Map<String, Object> map = new TreeMap<>();
        map.put("keyOne", "马丁路德金");
        map.put("keyTwo", "小布什");
        valueStack.push(map);
        System.out.println("userName: " + userName);
        helloCount++;
        return SUCCESS;
    }

    public String upload() {
        String dir = "/Users/jinyang/Desktop/study/Java/struts/Struts2SimpleExample/simple-interceptor";
        System.out.println("test: " + test.toString());
        System.out.println("testFileName: " + testFileName);
        System.out.println("testContentType: " + testContentType);
        File destFile = new File(dir, testFileName);
        try {
            FileUtils.copyFile(test, destFile);
            return SUCCESS;
        } catch (IOException e) {
            return ERROR;
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        System.out.println("setUserName with: " + userName);
        this.userName = userName;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        System.out.println("\n\n\n\n\n\n\nsetPerson() is called!!!!\n\n\n\n\n");
        this.person = person;
    }

    public String getTestFileName() {
        return testFileName;
    }

    public void setTestFileName(String testFileName) {
        this.testFileName = testFileName;
    }

    public String getTestContentType() {
        return testContentType;
    }

    public void setTestContentType(String testContentType) {
        this.testContentType = testContentType;
    }

    public File getTest() {
        return test;
    }

    public void setTest(File test) {
        this.test = test;
    }
}
