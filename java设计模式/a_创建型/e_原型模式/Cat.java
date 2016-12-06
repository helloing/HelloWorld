package com.java设计模式.a_创建型.e_原型模式;

import com.arithmetic.util.Log;

import java.util.Date;

/**
 * Created by malei on 2016/12/5.
 */
public class Cat implements Cloneable{

    private String name;
    private int age;
    private Date birthday;

    public Cat(String name,int age,Date birthday){
        this.name=name;
        this.age=age;
        this.birthday=birthday;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthday() {
        return birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone(); //直接使用父类的克隆方法
        //添加如下代码实现深复制
        Cat s = (Cat) obj;
        //将属性中的对象（非基本数据类型）也进行拷贝
        s.birthday = (Date) this.birthday.clone();
        return obj;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Cat cat = new Cat("tom",12,new Date());
        Log.show(cat.getName());
        //克隆一个对象，对象不同，但属性值相同
        Cat cat2 = (Cat)cat.clone();
        Log.show("cat和cat2是否相等:" + (cat==cat2));
        Log.show(cat2.getName());
        Log.show(cat2.getAge());
        Log.show(cat2.getBirthday()+"");
        Log.show(cat.getBirthday()+"");
    }
}
