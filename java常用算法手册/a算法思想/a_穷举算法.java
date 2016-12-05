package com.java常用算法手册.a算法思想;

import com.arithmetic.util.Log;

/**
 * Created by malei on 2016/12/4.
 * 1）穷举算法思想：为了解决问题和解决问题
 */
public class a_穷举算法 {

    /**
     * 笼子里有鸡和兔，从上面说有35个头，下面共有94个脚，求鸡和兔的各自数量
     */
    public static void main(String[] args){
        qiongju(35,94);
    }
    /**
     * chook + rabbit = head;
     * chook*2 + rabbit*4 = foot;
      */
    private static void qiongju(int head, int foot) {
        for (int chook = 0 ; chook <= head ; chook++){
            if((chook*2 + (head - chook)*4) == foot){
                Log.show("鸡的个数："+chook +" 兔子的个数："+(head-chook));
            }
        }
    }
}
