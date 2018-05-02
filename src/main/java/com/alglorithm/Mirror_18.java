package com.alglorithm;

import com.alglorithm.utils.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * CreatedBy cx
 * CreateTime 2018/4/23 16:22
 * Description操作给定的二叉树，将其变换为源二叉树的镜像。
 输入描述:
 二叉树的镜像定义：源二叉树
 8
 /  \
 6   10
 / \  / \
 5  7 9 11
 镜像二叉树
 8
 /  \
 10   6
 / \  / \
 11 9 7  5
 */
public class Mirror_18 {
    public void Mirror(TreeNode root) {
        TreeNode temp = null;
        if (root!=null){
            temp = root.left;
            root.left = root.right;
            root.right = temp;
            if (root.right!=null){
                Mirror(root.right);
            }
            if (root.left!=null){
                Mirror(root.left);
            }
        }
    }

}
