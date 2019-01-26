package com.liu.binarytree;

import com.liu.queueandstack.stack.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: BuildTree
 * @Auther: yu
 * @Date: 2019/1/26 11:52
 * @Description: 构造二叉树
 * 从中序与后序遍历序列构造二叉树
 */
public class BuildTree {
    Map<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || inorder.length == 0) {
            return null;
        }
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    public TreeNode buildTree(int[] a, int a1, int a2, int[] b, int b1, int b2) {
        if (a1 > a2 || b1 > b2) { return null; }
        int mid = map.get(b[b2]);
        int count = mid - a1;
        TreeNode root = new TreeNode(b[b2]);
        root.left = buildTree(a, a1, mid - 1, b, b1, b1 + count - 1);
        root.right = buildTree(a, mid + 1, a2, b, b1 + count, b2 - 1);
        return root;
    }
}
