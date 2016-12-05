package com.java常用算法手册.c查找算法;

import com.arithmetic.util.Log;

import java.util.Arrays;

/**
 * Created by malei on 2016/12/4.
 */
public class 折半查找 {

    public static void main(String[] args){
        int[] arr = {45,190,234};
        Log.show(search(arr,190));
    }

    private static int search(int[] arr,int x) {
        int length = arr.length;
        int low = 0;
        int mid;
        int high = length-1;
        while (low <= high){
            mid=(low+high)/2;
            if(arr[mid] == x){
                return mid;
            }else if(arr[mid] >x){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return -1;
    }
}
