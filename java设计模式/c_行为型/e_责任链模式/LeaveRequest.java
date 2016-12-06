package com.java设计模式.c_行为型.e_责任链模式;

/**
 * Created by malei on 2016/12/6.
 * 请假条：封装请求的基本信息
 */
public class LeaveRequest {
    private String name;  //姓名
    private int leaveDays;  //离开天数

    private LeaveRequest(){};
    public LeaveRequest(String name,int leaveDays){
        this.name = name;
        this.leaveDays = leaveDays;
    }

    public String getName() {
        return name;
    }

    public int getLeaveDays() {
        return leaveDays;
    }
}
