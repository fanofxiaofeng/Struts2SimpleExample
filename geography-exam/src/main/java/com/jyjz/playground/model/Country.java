package com.jyjz.playground.model;

/**
 * 用于表示几个国家的枚举类
 */
public enum Country {
    CN("People's Republic of China"),
    US("United States"),
    MX("Mexico"),
    KP("North Korea"),
    KR("South Korea"),
    JP("Japan"),
    MN("Mongolia"),
    NZ("New Zealand"),
    IS("Iceland"),
    IL("Israel"),
    AR("Argentina");

    private String name;

    Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAbbr() {
        return this.toString().toLowerCase();
    }
}
