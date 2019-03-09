package com.liu.structure.narytree;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Postorder
 * @Auther: yu
 * @Date: 2019/2/17 19:51
 * @Description:  N-ary Tree Postorder Traversal
 * 给定一个 N 叉树，返回其节点值的后序遍历。
 */
public class Postorder {
    public List<Integer> postorder(Node root) {
        List<Integer> ansList = new ArrayList<>();
        recursivePostorder(root, ansList);
        return ansList;
    }

    public  void recursivePostorder(Node root, List<Integer> ansList) {
        if (root == null) {
            return;
        }
        if (root.children != null) {
            for (Node tmp : root.children) {
                recursivePostorder(tmp, ansList);
            }
        }
        ansList.add(root.val);
    }
}
