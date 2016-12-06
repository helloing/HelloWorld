package com.java设计模式.c_行为型.e_责任链模式;

import com.arithmetic.util.Log;

/**
 * Created by malei on 2016/12/6.
 */
public class Cto extends Leader{
    public Cto(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDays() < 10){
            Log.show(this.name+"同意了");
        }else{
            Log.show("请假条向上递交");
            if(this.nextLeader != null){
                this.nextLeader.handleRequest(request);
            }
        }
    }
}
