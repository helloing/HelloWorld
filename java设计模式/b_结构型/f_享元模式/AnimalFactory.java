package com.java设计模式.b_结构型.f_享元模式;

import com.arithmetic.util.Log;

import java.util.HashMap;

/**
 * Created by malei on 2016/12/6.
 */
public class AnimalFactory {

    private static final HashMap<String, Animal> list = new HashMap();

    public static Animal get(String name){
        Animal item = (Animal)list.get(name);
        if(item == null){
            Log.show("向List添加新对象");
            if(name.equals("猫")){
                item =new Cat();
                list.put("猫",item);
            }else if(name.equals("狗")){
                item =new Dog();
                list.put("狗",item);
            }
        }
        return item;
    }

    public static void main(String[] args){
        for (int i= 0 ; i <10 ;i++){
            Animal item = AnimalFactory.get("猫");
            item.run(2);
        }
    }
}
