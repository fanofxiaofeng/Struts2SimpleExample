package com.jyjz.playground.action;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import org.joda.time.DateTime;

import java.util.Date;

public class NaiveDateTimeAction extends ActionSupport {
    /**
     * 当前时间
     */
    private DateTime currentDateTime;

    /**
     * 一天前
     */
    private DateTime dateTimeOneDayAgo;

    /**
     * 一个月前
     */
    private DateTime dateTimeOneMonthAgo;

    /**
     * 一年前
     */
    private DateTime dateTimeOneYearAgo;

    @Override
    public String execute() {
        return SUCCESS;
    }

    public DateTime getCurrentDateTime() {
        return currentDateTime;
    }

    public void setCurrentDateTime(DateTime currentDateTime) {
        this.currentDateTime = currentDateTime;
    }

    public DateTime getDateTimeOneDayAgo() {
        return dateTimeOneDayAgo;
    }

    public void setDateTimeOneDayAgo(DateTime dateTimeOneDayAgo) {
        this.dateTimeOneDayAgo = dateTimeOneDayAgo;
    }

    public DateTime getDateTimeOneMonthAgo() {
        return dateTimeOneMonthAgo;
    }

    public void setDateTimeOneMonthAgo(DateTime dateTimeOneMonthAgo) {
        this.dateTimeOneMonthAgo = dateTimeOneMonthAgo;
    }

    public DateTime getDateTimeOneYearAgo() {
        return dateTimeOneYearAgo;
    }

    public void setDateTimeOneYearAgo(DateTime dateTimeOneYearAgo) {
        this.dateTimeOneYearAgo = dateTimeOneYearAgo;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static void main(String[] args) {
        Date date = new Date();
        DateTime dateTime = new DateTime(2018, 3, 31, 0, 0, 0);
        System.out.println(dateTime.minusMonths(1).toString("yyyy-MM-dd HH:mm:ss"));
        System.out.println(dateTime.toDate());
    }
}
