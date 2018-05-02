package com.alglorithm;

import java.util.Stack;
import java.util.Vector;

/**
 * CreatedBy cx
 * CreateTime 2018/4/25 21:50
 * Description输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 */
public class IsPopOrder_21 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack();
        if (pushA.length==0||popA.length==0){
            return false;
        }
        int popindex = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.empty()&&stack.peek()==popA[popindex]){
                stack.pop();
                popindex++;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        System.out.println(Math.round(-11.5));//原来的数字加上0.5后再向下取整
    }
}

