package com.alglorithm;

import com.alglorithm.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * CreatedBy cx
 * CreateTime 2018/6/29 10:12
 * Description 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class Convert_26 {
//    public TreeNode Convert(TreeNode pRootOfTree) {
//////                    10
//////            5               12
//////          4   7
////
//
//        if(pRootOfTree.right!=null){
//
//        }
//        if (pRootOfTree.left!=null){
//
//        }
//    }
    //返回树最左节点
    public TreeNode leftMax(TreeNode root){
        if (root.left==null){
                return root;
        }
        return leftMax(root.left);
    }
    //返回树最右节点
    public TreeNode rightMin(TreeNode root){
        if (root.right==null){
            return root;
        }else {
            return root.right;
        }
    }

    static Queue a=new LinkedList();
    public static  void syso(int k,char s[]) throws InterruptedException {
        for (int i = 0; i < s.length ; i++) {
            a.offer(s[i]);
        }
        for (int i = 0; i < 2*k+1; i++) {
            if (i<k){
                space(i);
                System.out.print(a.poll());
                space(k+1-2*i);
                System.out.print(a.poll());
                System.out.print("\n");
            }
            if (i==k){
                space(i);
                System.out.print(a.poll());
                System.out.print("\n");
            }
            if (i>k){
                space(k);
                System.out.print(a.poll());
                System.out.print("\n");
            }
        }
    }



    public static void a() {
        int a[]={1,2,3};
        int b[]={4,5,6};
        Stack c = new Stack();
        c.push(a);
        c.push(b);
        int d[];
        d=(int[])c.pop();
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
    }

    public static void space(int i){
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        syso(2,new char[]{'a','b','c','d','e','f','g'});
        a();
    }
}
