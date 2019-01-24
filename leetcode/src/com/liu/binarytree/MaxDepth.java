package com.liu.binarytree;

import com.liu.queueandstack.stack.TreeNode;

/**
 * @ClassName: MaxDepth
 * @Auther: yu
 * @Date: 2019/1/22 08:34
 * @Description: 二叉树的最大深度
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rigthDepth = maxDepth(root.right);

        return leftDepth > rigthDepth ? (leftDepth+1) : (rigthDepth+1);
    }
}
