package com.java设计模式.c_行为型.j_中介者模式;

import com.arithmetic.util.Log;

/**
 * Created by malei on 2016/12/6.
 * 研发部
 */
public class Delelopment implements Department {

    private final Mediator mediator;

    public Delelopment(Mediator mediator){
        this.mediator = mediator;
    }

    @Override
    public void action() {
        Log.show("研发部活动");
    }
}
