package com.liu.structure.binarytree;

import com.liu.structure.queueandstack.stack.TreeNode;

/**
 * @ClassName: IsValidBSt
 * @Auther: yu
 * @Date: 2019/2/2 19:05
 * @Description:  验证二叉搜索树
 */
public class IsValidBSt {
    public boolean isValidBST(TreeNode root) {
        if (root == null){
            return true;
        }
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean valid(TreeNode root, long low, long high) {
        if (root == null) {
            return true;
        }
        if (root.val <= low || root.val >= high) {
            return false;
        }
        return valid(root.left, low, root.val) && valid(root.right, root.val, high);
    }
}
