package com.jyjz.playground.interceptor;

import com.jyjz.playground.action.NaiveDateTimeAction;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import org.joda.time.DateTime;

public class NaiveInterceptor extends AbstractInterceptor {

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {

        if (invocation.getAction() instanceof NaiveDateTimeAction) {
            calculateSeveralDateTimeFields((NaiveDateTimeAction) invocation.getAction());
        }

        return invocation.invoke();
    }

    /**
     * 计算出几个时间域的值
     *
     * @param action 要处理的 action
     */
    private void calculateSeveralDateTimeFields(NaiveDateTimeAction action) {
        DateTime currentDateTime = new DateTime();

        action.setCurrentDateTime(currentDateTime);
        action.setDateTimeOneDayAgo(currentDateTime.minusDays(1));
        action.setDateTimeOneMonthAgo(currentDateTime.minusMonths(1));
        action.setDateTimeOneYearAgo(currentDateTime.minusYears(1));
    }
}
