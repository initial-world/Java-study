package com.sort;

/**
 * @author cx
 * @date 2018/8/29 9:43
 * @description 选择排序O(n^2) 从i=0开始每次取后面最小的放在i上面
 */
public class SelectionSort {
    public static void selectionSort(int arr[]){
        int temp=0;
        for (int i = 0; i < arr.length-1; i++) {
            temp=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[temp]){
                    temp=j;
                }
            }
            swap(arr,i,temp);
        }
    }

    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void main(String[] args) {
        int arr[]={1,3,2,45,65,33,12};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
