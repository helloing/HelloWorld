package com.java设计模式.c_行为型.c_观察者模式;

/**
 * Created by malei on 2016/12/6.
 * 抽象主题，被观察者
 * 事件源接口
 */
public interface Subject {

    //添加观察者
    void addObserver(Observer observer);
    //移除指定的观察者
    void removeObserver(Observer observer);
    //通知所有观察者
    void notifyAllObserver(Object data);
}
