package com.java设计模式.b_结构型.b_桥接模式;

/**
 * Created by malei on 2016/12/5.
 * 小米电视
 */
public class XiaoMiTV implements  ITV{
    @Override
    public void on() {
        System.out.println("打开电视");
    }

    @Override
    public void setChannel(int a) {
        System.out.println("选择频道 = "+a);
    }

    public static void main(String[] args){
        ITV itv = new XiaoMiTV();
        XiaoMiControl control = new XiaoMiControl(itv);
        control.turnOn();
        control.setChannelKey(1);
    }
}
