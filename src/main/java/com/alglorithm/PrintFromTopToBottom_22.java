package com.alglorithm;

import com.alglorithm.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * CreatedBy cx
 * CreateTime 2018/4/28 15:15
 * Description 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */

public class PrintFromTopToBottom_22 {
    /**
     * @Description
     * @Params
     * @Author cx
     * @CreateTime 2018/4/28
     * @Return
     */
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        if (root==null){
            return arrayList;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            if (treeNode.left!=null){
                queue.offer(treeNode.left);
            }
            if (treeNode.right!=null){
                queue.offer(treeNode.right);
            }
            arrayList.add(treeNode.val);
        }
        return arrayList;
    }
}
