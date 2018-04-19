package com.alglorithm;

import com.alglorithm.utils.ListNode;

/**
 * CreatedBy cx
 * CreateTime 2018/4/19 16:37
 * Description输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class Merge_16 {
    public static ListNode Merge(ListNode list1,ListNode list2) {
        ListNode p = new ListNode(0);
        ListNode q = null;
        if (list1==null){
            return list2;
        }
        if (list2==null){
            return list1;
        }
        while (list1!=null&&list2!=null){
            if (list1.val<=list2.val){
                if (q==null){
                    q = p = list1;
                }else {
                    p.next = list1;
                    p = p.next;
                }
                list1 = list1.next;
            }else {
                if (q==null){
                    q = p = list1;
                }else {
                    p.next = list2;
                    p = p.next;
                }
                list2 = list2.next;
            }
        }
        if (list1==null){
            p.next = list2;
        }
        if (list2==null){
            p.next = list1;
        }
        return q;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(3);
        ListNode a3 = new ListNode(5);
        ListNode b1 = new ListNode(2);
        ListNode b2 = new ListNode(4);
        ListNode b3 = new ListNode(6);
        a1.next = a2;a2.next = a3;b1.next = b2;b2.next = b3;
        ListNode b = Merge(a1,b1);
        while (b!=null){
            System.out.println(b.val);
            b = b.next;
        }
    }
}
