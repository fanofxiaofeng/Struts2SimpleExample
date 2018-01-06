package com.jyjz.playground.action;

import com.jyjz.playground.model.Country;
import com.jyjz.playground.model.QueryResult;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QueryAction extends ActionSupport {
    private QueryResult queryResult;

    private List<Country> countries;

    {
        queryResult = new QueryResult();
        System.out.println("countryTest is constructed");
        countries = new ArrayList<>();
        Collections.addAll(countries, Country.values());
    }

    @Override
    public String execute() {
        return SUCCESS;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public QueryResult getQueryResult() {
        return queryResult;
    }
}
