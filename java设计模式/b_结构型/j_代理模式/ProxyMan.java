package com.java设计模式.b_结构型.j_代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by malei on 2016/12/6.
 * 代理人, 由于需要帮委托人带饭, 也必须实现午饭接口
 */
public class ProxyMan implements Lunch {

    private final You mYou;

    public ProxyMan(You you) {
        mYou = you;
    }
    @Override
    public void eat() {
        mYou.eat();
    }

    //静态代理
    public static void main(String[] ages){
        You you = new You();
        ProxyMan man = new ProxyMan(you);
        man.eat();
    }

    //动态代理
    public static void main2(String[] ages){
        You you = new You();
        Lunch people = (Lunch) Proxy.newProxyInstance(you.getClass().getClassLoader(),
                new Class[]{Lunch.class}, new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        return method.invoke(you,args);
                    }
                });
        people.eat();
    }
}
