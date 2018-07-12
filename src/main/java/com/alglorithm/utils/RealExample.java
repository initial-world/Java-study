package com.alglorithm.utils;

/**
 * CreatedBy cx
 * CreateTime 2018/6/26 20:30
 * Description
 */
public class RealExample {
    public static TreeNode getTreeNode() {
        return treeNode;
    }

    public static void setTreeNode(TreeNode treeNode) {
        RealExample.treeNode = treeNode;
    }

    public static ListNode getListNode(String a) {
        return listNode;
    }

    public static void setListNode(ListNode listNode) {
        RealExample.listNode = listNode;
    }

    public static TreeNode treeNode;
//                    10
//            5               12
//          4   7
    public static ListNode listNode;
    public RealExample() {
        treeNode=new TreeNode(10);
        treeNode.left=new TreeNode(5);
        treeNode.left.left=new TreeNode(4);
        treeNode.left.right=new TreeNode(7);
        treeNode.right=new TreeNode(12);
    }
}
