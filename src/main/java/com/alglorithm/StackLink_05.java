package com.alglorithm;

import java.util.Stack;

/**
 * @CreatedBy cx
 * @CreatedTime 2018/4/4 22:01
 * @description
 */
public class StackLink_05 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.empty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
