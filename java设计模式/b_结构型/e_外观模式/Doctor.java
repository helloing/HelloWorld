package com.java设计模式.b_结构型.e_外观模式;

/**
 * Created by malei on 2016/12/6.
 * Doctor是控制类，通过这个类可以控制Disease的实现类
 */
public class Doctor {

    private final ColdDis mColdDis;
    private final HotDis mHotDis;

    public Doctor(){
        mColdDis =  new ColdDis();
        mHotDis =  new HotDis();
    }

    public void sayByCold(){
        mColdDis.say();
    }

    public void sayByHot(){
        mHotDis.say();
    }

    public static void main(String[] args){
        Doctor dor = new Doctor();
        dor.sayByCold();
    }
}
