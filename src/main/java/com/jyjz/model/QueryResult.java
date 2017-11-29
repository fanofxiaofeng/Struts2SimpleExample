package com.jyjz.model;

import com.google.gson.Gson;

public class QueryResult {
    private String name;
    private String abbr;

    public String getName() {
        System.out.println("getName in CountryTest is called. " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("setName in CountryTest is called. " + name);

        boolean found = false;
        for (Country country : Country.values()) {
            if (country.getName().equals(name)) {
                abbr = country.getAbbr();
                found = true;
            }
        }
        if (!found) {
            throw new RuntimeException();
        }
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}

