package com.java设计模式.b_结构型.b_桥接模式;

/**
 * Created by malei on 2016/12/5.
 * 标准遥控器抽象
 */
public abstract class AbstractControl {

    private final ITV mITV;

    public AbstractControl(ITV ITV) {
        mITV = ITV;
    }

    public void turnOn() {
        mITV.on();
    }

    public void setChannel(int channel) {
        mITV.setChannel(channel);
    }
}
