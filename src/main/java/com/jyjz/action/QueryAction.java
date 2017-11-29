package com.jyjz.action;

import com.jyjz.model.Country;
import com.jyjz.model.QueryResult;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

public class QueryAction extends ActionSupport {
    private QueryResult queryResult;

    private List<String> countries;

    {
        queryResult = new QueryResult();
        System.out.println("countryTest is constructed");
        countries = new ArrayList<>();
        for (Country country : Country.values()) {
            countries.add(country.getName());
        }
    }

    @Override
    public String execute() {
        return SUCCESS;
    }

    public List<String> getCountries() {
        return countries;
    }

    public QueryResult getQueryResult() {
        return queryResult;
    }
}
