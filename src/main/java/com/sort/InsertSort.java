package com.sort;

/**
 * @author cx
 * @date 2018/8/30 15:53
 * @description 直接插入排序O(n)~O(n^2) 从i=1开始取i上的数插入0~i数组中
 */
public class InsertSort {
    public static void main(String[] args) {
        int arr[]={1,3,2,45,65,33,12};
        insertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void insertSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int j;
            int temp = arr[i];
            for ( j = i-1; j >= 0&&arr[j] > temp; j--) {
                arr[j+1]=arr[j];
            }
            arr[j+1] = temp;
        }
    }
    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
