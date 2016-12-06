package com.java设计模式.c_行为型.j_中介者模式;

import com.arithmetic.util.Log;

/**
 * Created by malei on 2016/12/6.
 * 市场部
 */
public class Market implements Department {

    private final Mediator mediator;

    public Market(Mediator mediator){
        this.mediator = mediator;
    }

    @Override
    public void action() {
        Log.show("市场部活动");
    }

    public static void main(String[] args){
        Mediator mediator = new CEO();
        Market market = new Market(mediator);
        Delelopment dev = new Delelopment(mediator);

        market.action();
        dev.action();
    }
}
