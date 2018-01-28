package com.jyjz.playground.enums;

public enum Operation {
    PLUS('+'),
    MINUS('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    Operation(char symbol) {
        this.symbol = symbol;
    }

    public static Operation stringToOperation(String symbol) {
        for (Operation operation : Operation.values()) {
            if (("" + operation.symbol).equals(symbol)) {
                return operation;
            }
        }
        throw new RuntimeException("没有匹配的运算");
    }

    @Override
    public String toString() {
        return symbol + "";
    }

    private char symbol;
}
