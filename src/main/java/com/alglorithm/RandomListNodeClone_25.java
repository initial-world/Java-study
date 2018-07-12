package com.alglorithm;

import com.alglorithm.utils.RandomListNode;

/**
 * CreatedBy cx
 * CreateTime 2018/6/27 9:11
 * Description输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 *
 *
 */
public class RandomListNodeClone_25 {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead==null){
            return null;
        }
        RandomListNode pCur =pHead;
        //每个节点复制将A-B-C变为A-A'-B-B'-C-C'
        while (pCur!=null){
            RandomListNode node = new RandomListNode(pCur.label);
            node.next=pCur.next;
            pCur.next=node;
            pCur=node.next;
        }
        pCur=pHead;
        //将A的random指针复制给A'的random
        while (pCur!=null){
            if (pCur.random!=null){
                pCur.next.random=pCur.random;
            }
            pCur=pCur.next.next;
        }
        //第三步 将链表拆分为两个链表
        // 复制链表的头结点
        RandomListNode head = pHead.next;
        //偶数位置为复制链表
        RandomListNode cur = head;
        //奇数位置为原链表
        pCur = pHead;
        //拆分链表
        while(pCur!=null){
            pCur.next = pCur.next.next;
            //注意最后一个复制节点的时候就没有next的next
            if(cur.next!=null) {
                cur.next = cur.next.next;
            }
            cur = cur.next;
            pCur = pCur.next;
        }
        return head;
    }
}
