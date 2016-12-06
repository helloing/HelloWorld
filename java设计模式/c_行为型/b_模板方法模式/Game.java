package com.java设计模式.c_行为型.b_模板方法模式;

/**
 * Created by malei on 2016/12/6.
 * 创建一个抽象类，它的模板方法被设置为 final
 * 父类的方法不实现，留出来让子类去根据自己的需求来实现
 */
public abstract class Game {

    protected abstract void initView();
    protected abstract void startPlay();
    protected abstract void endPlay();

    public final void play(){
        initView();
        startPlay();
        endPlay();
    }
}
