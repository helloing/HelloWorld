package com.java设计模式.c_行为型.b_模板方法模式;

import com.arithmetic.util.Log;

/**
 * Created by malei on 2016/12/6.
 */
public class DotaGame extends Game{

    @Override
    protected void initView() {
        Log.show("初始化数据");
    }

    @Override
    protected void startPlay() {
        Log.show("游戏开始");
    }

    @Override
    protected void endPlay() {
        Log.show("游戏结束");
    }

    public static void main(String[] args){
        Game game = new DotaGame();
        game.play();  //调用的父类的方法，但是实现却是子类
    }
}
