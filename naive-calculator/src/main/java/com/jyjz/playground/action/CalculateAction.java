package com.jyjz.playground.action;

import com.jyjz.playground.enums.Operation;
import com.jyjz.playground.model.CalculateProcess;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class CalculateAction extends ActionSupport {

    private String firstOperator;
    private String secondOperator;
    private String operation;
    private String result;

    @Override
    public void validate() {
        if (StringUtils.isEmpty(firstOperator)) {
            addFieldError("firstOperator", "第一个操作数必须填写");
            System.out.println("here 1");
        }
        if (StringUtils.isEmpty(secondOperator)) {
            addFieldError("secondOperator", "第二个操作数必须填写");
            System.out.println("here 2");
        }
    }

    @Override
    public String execute() {
        try {
            CalculateProcess calculateProcess = new CalculateProcess(NumberUtils.toDouble(firstOperator),
                    Operation.stringToOperation(operation),
                    NumberUtils.toDouble(secondOperator));
            System.out.println(calculateProcess.toString());
            result = calculateProcess.toString();
            return SUCCESS;
        } catch (Exception e) {
            System.out.println(e.toString());
            return ERROR;
        }
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getResult() {
        return result;
    }

    public String getFirstOperator() {
        return firstOperator;
    }

    public void setFirstOperator(String firstOperator) {
        this.firstOperator = firstOperator;
    }

    public String getSecondOperator() {
        return secondOperator;
    }

    public void setSecondOperator(String secondOperator) {
        this.secondOperator = secondOperator;
    }
}
