package com.jyjz.playground.action;

import com.jyjz.playground.model.Trick;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class StrollAction extends ActionSupport {

    @Override
    public String execute() {
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        Trick trick = new Trick();
        trick.setDoggy("中华田园犬");
        valueStack.push(trick);
        return SUCCESS;
    }
}
