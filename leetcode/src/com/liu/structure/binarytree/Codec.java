package com.liu.structure.binarytree;

import com.liu.structure.queueandstack.stack.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName: Codec
 * @Auther: yu
 * @Date: 2019/1/30 16:57
 * @Description: 二叉树的序列化与反序列化
 */
public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder res = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (root == null) {
            return res.toString();
        }
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur != null) {
                res.append(cur.val + " ");
                queue.offer(cur.left);
                queue.offer(cur.right);
            } else {
                res.append("# ");
            }
        }
        System.out.println(res.toString().trim());
        return res.toString().trim();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.length() == 0) {
            return null;
        }
        String[] str = data.split(" ");
        TreeNode root = createTree(str);
        return root;
    }

    public TreeNode createTree(String[] str) {
        TreeNode root = null;
        int index = 0;
        root = createTreeNode(str[index++]);
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        TreeNode node = null;
        while (!queue.isEmpty()) {
            node = queue.poll();
            node.left = createTreeNode(str[index++]);
            node.right = createTreeNode(str[index++]);
            if (node.left != null){
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return root;
    }

    public TreeNode createTreeNode(String str) {
        if (str.equals("#")) {
            return null;
        }
        return new TreeNode(Integer.parseInt(str));
    }
}

