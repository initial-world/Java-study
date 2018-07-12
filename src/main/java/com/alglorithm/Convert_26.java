package com.alglorithm;

import com.alglorithm.utils.TreeNode;

/**
 * CreatedBy cx
 * CreateTime 2018/6/29 10:12
 * Description 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class Convert_26 {
//    public TreeNode Convert(TreeNode pRootOfTree) {
////                    10
////            5               12
////          4   7
//
//    }
    //返回左子树最右叶子节点,即链表节点的左边
    public TreeNode leftMax(TreeNode root){
        if (root.left==null){
            //树的最左边，最右边指向这个节点
            return null;
        }
        root = root.left;
        while (root.right!=null){
            root=root.right;
        }
        return root;
    }
//    //返回右子树最左叶子节点,即链表节点的右边
//    public TreeNode rightMin(TreeNode root){
//        if (root.right==null){
//            //找父节点
//        }else {
//            return root.right;
//        }
//    }
}
