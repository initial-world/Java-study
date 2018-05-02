package com.alglorithm;

import com.alglorithm.utils.TreeNode;

/**
 * CreatedBy cx
 * CreateTime 2018/4/20 16:22
 * Description 判断1是否是2的子树
 */
public class HasSubtree_17 {
    public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
        while (root2!=null&&root1!=null){
            if (root2.val==root1.val){
                if (equal(root1,root2)){
                    return true;
                }else {
                    return HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
                }
            }else {
                return HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
            }
        }
        return false;
    }
    public static boolean equal(TreeNode root1,TreeNode root2){
        if (root1==null&&root2!=null){
            return false;
        }
        if (root2==null){
            return true;
        }
        if (root1.val==root2.val){
            if (equal(root1.left,root2.left)&&equal(root1.right,root2.right)){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(8);
        a.left = new TreeNode(9);
        a.right = new TreeNode(2);
        TreeNode b = new TreeNode(8);
        b.left = new TreeNode(9);
        b.right = new TreeNode(3);
        b.left.left = new TreeNode(3);
        System.out.println(HasSubtree(b,a));
    }
}
