package com.sort;

import com.alglorithm.utils.ListNode;

import java.util.LinkedList;

/**
 * @author cx
 * @date 2018/8/27 16:33
 * @description 平均O(nlogn)，最坏O(n^2)
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] test = {46,30, 82, 90 ,56 ,17 ,95 ,15};
//        quicksort(test,0,test.length-1);
//        for (int i = 0; i < test.length; i++) {
//            System.out.print(test[i] + "\t");
//        }
        ListNode p = new ListNode(test[0]);
        ListNode q = p;
        for (int i = 1; i < test.length; i++) {
            q.next=new ListNode(test[i]);
            q=q.next;
        }
        quickSortLinkedlist(p,null);
        while (p.next!=null){
            System.out.println(p.next.val);
            p=p.next;
        }
    }
    public static void swap(int arr[],int a,int b){
        int temp = arr[a];
        arr[a]=b;
        arr[b]=temp;
    }
    public static void quicksort(int arr[],int l,int r){
        if (l<r){
            int i = l;
            int j = r;
            int temp = arr[l];
            while (i<j){
                while (i<j&&arr[j]>=temp){
                    j--;
                }
                if (i<j){
                    arr[i++]=arr[j];
                }
                while (i<j&&arr[i]<temp){
                   i++;
                }
                if (i<j){
                    arr[j--]=arr[i];
                }
            }
            arr[i]=temp;
            quicksort(arr,l,i-1);
            quicksort(arr,i+1,r);
        }
    }

    public static void quickSortLinkedlist(ListNode left,ListNode right){
        if (left!=right){
            //一个移动的指针--左
            ListNode p = left;
            //一个移动的指针--右
            ListNode q = left.next;
            int temp = left.val;
            while (q!=right){
                //q指针向右移，当q<p
                if (temp>q.val&&p.next.val==q.val){
                    swapListNode(p,q);
                    p=p.next;
                    q=q.next;
                }
                else if (temp>q.val&&p.next!=q){
                    swapListNode(p,q);
                    p=p.next;
                }
                else if (temp<=q.val){
                    q=q.next;
                }
                if (p.val>temp){
                    swapListNode(p,q);
                }
            }
            quickSortLinkedlist(left,p);
            quickSortLinkedlist(p.next,right);
        }
    }

    public static void swapListNode(ListNode p,ListNode q){
        int temp = p.val;
        p.val = q.val;
        q.val = temp;
    }
}
