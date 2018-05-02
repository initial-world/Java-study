package com.alglorithm;

import java.util.Stack;

/**
 * CreatedBy cx
 * CreateTime 2018/4/25 20:56
 * Description 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */
public class StackMin_20 {
    Stack<Integer> data = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();
    Integer temp = null;
    public void push(int node) {
        data.push(node);
        if (temp != null) {
            if (node <= temp) {
                min.push(node);
                temp = node;
            }
        } else {
            temp = node;
            min.push(node);
        }
    }

    public void pop() {
        if (temp==data.pop()){
            min.pop();
            temp = min.peek();
        }
    }

    public int top() {
        return data.peek();
    }

    public int min() {
        return min.peek();
    }
}
