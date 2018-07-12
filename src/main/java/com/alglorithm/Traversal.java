package com.alglorithm;

import com.alglorithm.utils.RealExample;
import com.alglorithm.utils.TreeNode;

import java.util.Stack;

/**
 * CreatedBy cx
 * CreateTime 2018/6/29 10:36
 * Description 二叉树的遍历
 */
public class Traversal {
    //递归版本 略

    //非递归版本
    // 先序、后序、中序
    public static void theFirstTraversal_Stack(TreeNode root, Stack<TreeNode> stack) {
        //先序遍历
        TreeNode node = root;
        //将所有左孩子压栈
        while (node != null || stack.size() > 0) {
            //压栈之前先访问
            if (node != null) {
                stack.push(node);
                visit(node);
                node = node.left;
            } else {
                node = stack.pop();
                node = node.right;
            }
        }
    }

    public void theInOrderTraversal_Stack(TreeNode root) {  //中序遍历
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        while (node != null || stack.size() > 0) {
            if (node != null) {
                //直接压栈
                stack.push(node);
                node = node.left;
            } else {
                //出栈并访问
                node = stack.pop();
                node = node.right;
            }
        }
    }

    public void thePostOrderTraversal_Stack(TreeNode root) {
        //后序遍历
        Stack<TreeNode> stack = new Stack<TreeNode>();
        //构造一个中间栈来存储逆后序遍历的结果
        Stack<TreeNode> output = new Stack<TreeNode>();
        TreeNode node = root;
        while (node != null || stack.size() > 0) {
            if (node != null) {
                output.push(node);
                stack.push(node);
                node = node.right;
            } else {
                node = stack.pop();
                node = node.left;
            }
        }
    }

    public static void visit(TreeNode treeNode){
        System.out.println(treeNode.val);
    }

    public static void main(String[] args) {
        RealExample r =new RealExample();
        theFirstTraversal_Stack(RealExample.treeNode,new Stack<TreeNode>());
    }
}
