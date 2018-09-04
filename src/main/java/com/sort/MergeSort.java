package com.sort;

/**
 * @author cx
 * @date 2018/8/27 15:16
 * @description 归并排序 全为O(nlogn) 分治 ，分成子问题，再合并
 */
public class MergeSort {
    public static void sort(int arr[]){
        int[] temp =new int[arr.length];
        sort(arr,0,arr.length-1,temp);
    }
    public static void sort(int arr[],int start,int end,int[] temp){
        if (start<end){
            int mid = (start+end)/2;
            sort(arr,start,mid,temp);
            sort(arr,mid+1,end,temp);
            merge(arr,start,mid,end,temp);
        }
    }

    public static void merge(int arr[],int start,int mid,int end ,int[] temp){
        int i=start,j=mid+1,k=0;
        while (i<=mid&&j<=end){
            if (arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }
        while (i<=mid){
            temp[k++]=arr[i++];
        }
        while (j<=mid){
            temp[k++]=arr[j++];
        }
        k=0;
        while (start<=end){
            arr[start++]=temp[k++];
        }
    }

    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
