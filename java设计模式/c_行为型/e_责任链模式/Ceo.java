package com.java设计模式.c_行为型.e_责任链模式;

import com.arithmetic.util.Log;

/**
 * Created by malei on 2016/12/6.
 */
public class Ceo extends Leader{
    public Ceo(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDays() < 30){
            Log.show(this.name+"同意了");
        }else{
            Log.show(this.name+"不同意了");
        }
    }

    public static void main(String[] args){
        Leader ceo = new Ceo("马磊");
        Leader cto = new Cto("马云");
        Leader cao = new Cao("马化腾");

        cao.setNextLeader(cto);
        cto.setNextLeader(ceo);

        LeaveRequest request = new LeaveRequest("Tom",30);
        cao.handleRequest(request);
    }
}
