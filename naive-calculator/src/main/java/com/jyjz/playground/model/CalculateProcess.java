package com.jyjz.playground.model;

import com.jyjz.playground.enums.Operation;

public class CalculateProcess {
    private double firstOperator;
    private double secondOperator;
    private Operation operation;

    public CalculateProcess(double firstOperator, Operation operation, double secondOperator) {
        this.firstOperator = firstOperator;
        this.operation = operation;
        this.secondOperator = secondOperator;
    }

    private double execute() {
        double result = 0.0;
        switch (operation) {
            case PLUS:
                result = firstOperator + secondOperator;
                break;
            case MINUS:
                result = firstOperator - secondOperator;
                break;
            case MULTIPLY:
                result = firstOperator * secondOperator;
                break;
            case DIVIDE:
                result = firstOperator / secondOperator;
                break;
            default:
                break;
        }
        return result;
    }

    @Override
    public String toString() {
        double result = execute();
        return String.format("%s %s %s = %s", firstOperator, operation, secondOperator, result);
    }
}