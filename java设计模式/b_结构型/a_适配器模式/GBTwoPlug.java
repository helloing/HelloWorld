package com.java设计模式.b_结构型.a_适配器模式;

/**
 * Created by malei on 2016/12/5.
 * 国标二相插座，即需要适配的类(Adaptee)
 * 墙上的插座居然是两相的
 */
public class GBTwoPlug {
    public void powerwith2(){
        System.out.println("使用二相电流供电");
    }
}
