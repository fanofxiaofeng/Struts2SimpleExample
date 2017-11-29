package com.jyjz.model;

import com.google.gson.Gson;

public class State {
    private String stateAbbr;
    private String stateName;

    public String getStateAbbr() {
        return stateAbbr;
    }

    public void setStateAbbr(String stateAbbr) {
        this.stateAbbr = stateAbbr;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
