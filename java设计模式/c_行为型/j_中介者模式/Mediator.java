package com.java设计模式.c_行为型.j_中介者模式;

/**
 * Created by malei on 2016/12/6.
 * 中介者接口
 */
public interface Mediator {
    void listener(String key,Department de);
    void say(String key);
}
