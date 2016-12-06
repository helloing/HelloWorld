package com.java设计模式.a_创建型.a_工厂模式;

import com.arithmetic.util.Log;

/**
 * Created by malei on 2016/12/5.
 * 贩卖实现规范的动物的工厂
 */
public class AnimalFactory {

    public Animal buyAnimal(String name){
        if(name == null){
            return null;
        }
        if(name.equals("猫")){
            return new Cat();
        }else if(name.equals("狗")){
            return new Dog();
        }
        return null;
    }

    public static void main(String[] args){
        AnimalFactory factory = new AnimalFactory();
        Animal dog = factory.buyAnimal("狗");
        dog.say();
    }
}
