package com.java设计模式.b_结构型.a_适配器模式;

/**
 * Created by malei on 2016/12/5.
 */
public class MacBook {

    private  ThreePlug plug;

    public MacBook(ThreePlug plug){
        this.plug = plug;
    }

    //充电
    public void charge(){
        System.out.println("使用三相电流供电");
        plug.powerwith3();
    }
    public static void main(String[] args){
        Adapter_2to3 adapter = new Adapter_2to3();
        MacBook book = new MacBook(adapter);
        book.charge();

    }
}
