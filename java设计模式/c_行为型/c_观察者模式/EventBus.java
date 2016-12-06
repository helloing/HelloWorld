package com.java设计模式.c_行为型.c_观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by malei on 2016/12/6.
 */
public class EventBus implements Subject{

    //观察者集合，用于管理所有的观察
    List<Observer> mList = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        if (observer == null) {
            throw new NullPointerException("observer == null");
        }
        if (!mList.contains(observer)) {
            mList.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        mList.remove(observer);
    }

    @Override
    public void notifyAllObserver(Object data) {
        for (Observer observer : mList) {
            observer.update(this, data);
        }
    }

    public static void main(String[] args){
        EventBus bus = new EventBus();
        bus.addObserver(new ObserverOne());
        bus.addObserver(new ObserverTwo());

        bus.notifyAllObserver("大家好");
    }
}
