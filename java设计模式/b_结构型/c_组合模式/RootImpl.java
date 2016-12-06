package com.java设计模式.b_结构型.c_组合模式;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by malei on 2016/12/6.
 */
public class RootImpl extends Root {

    private String name;
    private List<Root> roots;

    public RootImpl(String name){
        this.name = name;
    }

    @Override
    public void addLeaf(Root leaf) {
        if (roots == null) {
            roots = new ArrayList<Root>();
        }
        roots.add(leaf);
    }

    @Override
    public void printStruct(String preStr) {
        //先输出自己
        System.out.println(preStr + "+" + name);
        //输出自组件
        if (roots != null) {
            preStr += " ";
            for (Root item : roots) {
                item.printStruct(preStr);
            }
        }
    }
}
