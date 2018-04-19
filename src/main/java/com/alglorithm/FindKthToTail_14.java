package com.alglorithm;

import com.alglorithm.utils.ListNode;

/**
 * CreatedBy cx
 * CreateTime 2018/4/18 22:10
 * Description输入一个链表，输出该链表中倒数第k个结点。
 */
public class FindKthToTail_14 {
    public ListNode FindKthToTail(ListNode head, int k) {
        ListNode p,q;
        p = head;
        q = head;
        if (head==null||k<=0){
            return null;
        }
        for (int i = 1; i < k ; i++) {
            if (p.next!=null)
                p = p.next;
            else
                return null;
        }
        while (p.next!=null)  {
            q = q.next;
            p = p.next;
        }
        return q;
    }
}
