package com.liu.structure.narytree;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName: preorder
 * @Auther: yu
 * @Date: 2019/2/17 19:35
 * @Description: N-ary Tree Preorder Traversal
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 */
public class Preorder {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new LinkedList<>();
        prehel(root,res);
        return res;

    }
    public void prehel(Node root,List<Integer> res) {
        if (root == null) {
            return;
        }
        List<Node> child = root.children;
        res.add(root.val);
        for (Node ele : child) {
            prehel(ele, res);
        }
    }
}
