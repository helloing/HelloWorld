package com.java常用算法手册.a算法思想;

import com.arithmetic.util.Log;

/**
 * Created by malei on 2016/12/4.
 * 分治算法思想：大问题分解成小问题
 */
public class d_分治算法 {

    /**
     * 30个硬币，其中有一个是假币，假币比真币轻，求什么办法可以找到假币？
     * 硬币是有编号的
     */
    public static void main(String[] args){
        int[] coins = {2,2,1,2,2,2,2,2,2};
        int count = opreate(coins,0,coins.length-1);
        Log.show(count+"");
    }

    /**
     * 解题思路:把钱分两堆，比较轻重，轻的在分。。。
     */
    private static int opreate(int[] coins, int low, int high) {

        int sum1=0; //前半段和
        int sum2=0; //后半段和

        //仅剩下两个进行比较了
        if(low+1 == high){
            if(coins[low] > coins[high]){
                return high;
            }else{
                return low;
            }
        }

        //个数为偶数
        if((high+1 - low) % 2 == 0){
            //前半段的和
            for (int i =0;i<= (low+(high-low))/2 ; i++){
                sum1 += coins[i];
            }
            //后半段的和
            for(int i= (low+(high-low))/2+1 ; i <= high ; i++){
                sum2 += coins[i];
            }
            //前后半段的比较
            if(sum1 > sum2){
                //前段大
                //小的继续循环
                return opreate(coins,(low+(high-low))/2+1,high);
            }else{
                //后端大
                return opreate(coins,low,(low+(high-low))/2);
            }

        }else {
            //个数问奇数时
            //前半段和
            for (int i = low; i<(low+(high-low))/2-1 ; i++){
                sum1 += coins[i];
            }
            //后半段和
            for (int i = low; i<(low+(high-low))/2+1 ; i++){
                sum2 += coins[i];
            }
            //前后相等，中间值问题
            if(sum1 == sum2){
                return (low+(high-low))/2+1;
            }
            //前后两段进行比较
            if(sum1 >sum2){
                //前段大
                //小的继续循环
                return opreate(coins,(low+(high-low))/2+1,high);
            }else {
                return opreate(coins,low,(low+(high-low))/2-1);
            }
        }
    }
}
