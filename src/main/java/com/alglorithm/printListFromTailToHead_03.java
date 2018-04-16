package com.alglorithm;

import com.alglorithm.utils.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @CreatedBy cx
 * @CreatedTime 2018/4/4 20:13
 * @description
 */
public class printListFromTailToHead_03 {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> integerStack = new Stack<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while(listNode!=null){
            integerStack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!integerStack.empty()){
            arrayList.add(integerStack.pop());
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        a.next = b;
        b.next = new ListNode(3);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList = printListFromTailToHead(a);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
