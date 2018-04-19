package com.alglorithm;

import com.alglorithm.utils.ListNode;

/**
 * CreatedBy cx
 * CreateTime 2018/4/19 14:38
 * Description输入一个链表，反转链表后，输出链表的所有元素。
 */
public class ReverseList_15 {
    public static ListNode ReverseList(ListNode head) {
        ListNode pre=null;
        ListNode next=null;

        if (head==null){
            return null;
        }
        while (head!=null){
            next = head.next;
            head.next=pre;
            pre = head;
            head = next;
        }
        return pre;
    }


    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        a1.next = a2;a2.next = a3;a3.next = a4;
        ListNode b = ReverseList(a1);
        while (b!=null){
            System.out.println(b.val);
            b = b.next;
        }
    }
}
