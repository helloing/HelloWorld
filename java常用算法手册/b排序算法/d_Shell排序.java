package com.java常用算法手册.b排序算法;

import com.arithmetic.util.Log;

import java.util.Arrays;

/**
 * Created by malei on 2016/12/4.
 */
public class d_Shell排序 {
    public static void main(String[] args){
        int[] arr = {190,234,45,78,100};
        shellSort2(arr);
    }

    private static void shellSort(int[] arr) {
        int length = arr.length;
        int temp=0;
        int j,x=0;
        Log.show("原生数据："+ Arrays.toString(arr));
        for (int r = length/2 ; r >= 1 ; r =r/2){  //r是增量，每次都缩小增量。增量为每组的元素个数
            for (int i = r; i<length; i++){
                temp = arr[i];
                j = i-r;  //
                while (j>=0 && temp < arr[j]){
                    arr[j+r] = arr[j];
                    j = j-r;  //进行下一组的比较
                }
                arr[j+r] = temp;
            }
            x++;
            Log.show("第"+x+"次排序"+Arrays.toString(arr));
        }
        Log.show(Arrays.toString(arr));
    }

    private static void shellSort2(int[] arr) {
        int length = arr.length;
        int temp ,j= 0;
        int d = length/2 ; //增量
        Log.show("原生数据："+ Arrays.toString(arr));
        while (d >= 1){  //循环到增量为1时结束
            for (int i = d; i<length; i++){
                temp = arr[i]; //获取序列中的下一个数据
                j = i -d;  //序列中前一个数据的序号
                while (j >= 0 && arr[j] >temp){ //前一个数大于下一个数
                    arr[j+d] = arr[j]; //将后一个数向前移动
                    j = j-d; //修改序号，继续向前比较
                }
                arr[j+d] = temp; //保存数据
            }
            d= d/2;  //增量减小
        }
        Log.show(Arrays.toString(arr));
    }


}
