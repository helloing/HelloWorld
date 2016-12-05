package com.java常用算法手册.b排序算法;

import com.arithmetic.util.Log;

import java.util.Arrays;

/**
 * Created by malei on 2016/12/4.
 * 插入排序：前两个进行比较排序，将第三个与前面已经排序好的进行比较，放到合适位置 O(n^2)
 * 1)首先对数组前2个数据进行从小到大的排序
 * 2）接着将第3个数据与排好序的2个数据比较，将第3个数据插入到合适的位置
 * 3）然后，将第4个元素插入到已排好序的前3个数据中
 */
public class c_插入排序 {

    public static void main(String[] args){
        int[] arr = {190,234,45,78,100};
        insertSort(arr);
    }

    private static void insertSort(int[] arr) {
        int length = arr.length;
        int temp,j=0;
        Log.show("原生数据："+ Arrays.toString(arr));
        for (int i =1;i < length; i++){
            temp = arr[i]; //将后一位保存
            j = i-1;
            while (j >= 0 && temp < arr[j]){ //前一位大于后一位
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
            Log.show("第"+i+"次："+Arrays.toString(arr));
        }
        Log.show(Arrays.toString(arr));
    }
}
