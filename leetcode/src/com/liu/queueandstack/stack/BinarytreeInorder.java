package com.liu.queueandstack.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName: BinarytreeInorder
 * @Auther: yu
 * @Date: 2018/11/8 20:23
 * @Description: 二叉树的中序遍历
 * 给定一个二叉树，返回它的中序遍历。
 */
public class BinarytreeInorder {

    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        while(root !=  null || stack.size() > 0){
            if(root != null){
                stack.push(root);
                root = root.left;
            }else{
                root = stack.peek();
                res.add(stack.pop().val);
                root = root.right;
            }

        }
        return  res;

    }
}



 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }