package com.liu.structure.binarytree;

import com.liu.structure.queueandstack.stack.TreeNode;

/**
 * @ClassName: HasPathSum
 * @Auther: yu
 * @Date: 2019/1/25 20:28
 * @Description: 路径总和
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 */
public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
            return false;
        }
        if(root.left==null&&root.right==null){
            if(root.val==sum){
                return true;
            }
            return false;
        }

        boolean result = true;
        result = hasPathSum(root.left,sum-root.val);
        if(result==true){
            return result;
        }
        result = hasPathSum(root.right,sum-root.val);
        if(result==true){
            return result;
        }
        return false;
    }
}
