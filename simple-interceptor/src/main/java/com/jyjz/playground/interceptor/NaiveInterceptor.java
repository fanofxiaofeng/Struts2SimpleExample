package com.jyjz.playground.interceptor;

import com.jyjz.playground.action.HelloWorldAction;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class NaiveInterceptor implements Interceptor {
    @Override
    public void destroy() {
        System.out.println("in destroy() of NaiveInterceptor");
    }

    @Override
    public void init() {
        System.out.println("in init() of NaiveInterceptor");
    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        System.out.println("a: in intercept() of NaiveInterceptor");
//        if (Math.random() < 0.5) {
        System.out.println(invocation.getAction().getClass().toString());
        if (invocation.getAction().getClass().toString().contains("HelloWorldAction")) {
            HelloWorldAction helloWorldAction = (HelloWorldAction) (invocation.getAction());
            helloWorldAction.setUserName("天地玄黄");
        }
//        }
        String result = invocation.invoke();
        System.out.println("b: in intercept() of NaiveInterceptor");
        return result;
    }
}
