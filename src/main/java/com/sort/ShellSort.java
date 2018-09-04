package com.sort;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author cx
 * @date 2018/8/29 10:55
 * @description 希尔排序    最好O(N)    平均O(N1.3) 最坏O(N^2)   空间O(1)    不稳定 复杂
 */
public class ShellSort {
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1};
        shellSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void shellSort(int arr[]){
        for (int d = arr.length/2; d > 0; d/=2) {
            //System.out.println("增量为"+d);
            for (int j = 0; j <= d ; j++) {
                int temp = j;
                int k = j;
                //System.out.println("j="+j);
                while (k<arr.length){
                    if (arr[k]<arr[temp]){
                        temp=k;
                    }
                    k+=d;
                }
                //System.out.println("交换"+j+"和"+temp);
                swap(arr,j,temp);
            }
            soutArr(arr);
        }
    }

    public static void swap(int arr[],int a,int b){
        if (a==b){
            return;
        }
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void soutArr(int arr[]){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.print("]");
    }

    public static void shellSortSmallToBig(int[] data) {
        int j = 0;
        int temp = 0;
        for (int increment = data.length / 2; increment > 0; increment /= 2) {
            System.out.println("increment:" + increment);
            for (int i = increment; i < data.length; i++) {
                System.out.println("i:" + i);
                temp = data[i];
                for (j = i - increment; j >= 0; j -= increment) {
                    System.out.println("j:" + j);
                    System.out.println("temp:" + temp);
                    System.out.println("data[" + j + "]:" + data[j]);
                    if (temp < data[j]) {
                        data[j + increment] = data[j];
                    } else {
                        break;
                    }
                }
                data[j + increment] = temp;
            }
            for (int i = 0; i < data.length; i++)
                System.out.print(data[i] + " ");
        }
    }

    public static void main2(String[] args) {
        int[] data = new int[] { 26, 53, 67, 48, 57, 13, 48, 32, 60, 50 };
        shellSortSmallToBig(data);
        System.out.println(Arrays.toString(data));
    }
}
