package com.liu.structure.binarytree;

import com.liu.structure.queueandstack.stack.TreeNode;

import java.util.Stack;

/**
 * @ClassName: BSTIterator
 * @Auther: yu
 * @Date: 2019/2/3 09:54
 * @Description: 二叉搜索树迭代器
 */
public class BSTIterator {

    Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        stack = new Stack();
        if (root == null){
            return ;
        }
        while (root != null){
            stack.push(root);
            root = root.left;
        }
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode node = stack.pop();
        int ans = node.val;
        if (node.right != null){
            node = node.right;
            while (node != null){
                stack.push(node);
                node = node.left;
            }
        }
        return ans;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
