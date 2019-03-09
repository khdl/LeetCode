package com.liu.structure.binarytree;

import com.liu.structure.queueandstack.stack.TreeNode;

/**
 * @ClassName: IsBalanced
 * @Auther: yu
 * @Date: 2019/2/14 18:21
 * @Description: 平衡二叉树
 */
public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        if(Math.abs(Depth(root.left) - Depth(root.right)) > 1) {
            return false;
        }else{
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }
    private int Depth(TreeNode root){
        if(root == null) {
            return 0;
        }
        return Math.max(Depth(root.left), Depth(root.right)) + 1;
    }
}
