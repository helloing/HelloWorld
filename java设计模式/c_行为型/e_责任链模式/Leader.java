package com.java设计模式.c_行为型.e_责任链模式;

/**
 * Created by malei on 2016/12/6.
 * 审批人：抽象类
 */
public abstract class Leader {

    protected String name;// 领导名字
    protected Leader nextLeader;// 领导的上一级领导
    public Leader() {
    }

    public Leader(String name) {
        this.name = name;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    //处理请求业务的核心方法
    public abstract void handleRequest(LeaveRequest request);

}
