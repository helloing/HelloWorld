package com.java设计模式.a_创建型.c_单例模式;

/**
 * Created by malei on 2016/12/5.
 */
public class InstanceClass {

    private InstanceClass instance;

    //构造函数要掩藏
    private InstanceClass(){};

    //双重判断，线程安全
    public InstanceClass getInstance(){
        if(instance == null ){
            synchronized (InstanceClass.class){
                if(instance == null){
                    instance = new InstanceClass();
                }
            }
        }
        return instance;
    }
}
