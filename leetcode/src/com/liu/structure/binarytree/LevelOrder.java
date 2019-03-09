package com.liu.structure.binarytree;

import com.liu.structure.queueandstack.stack.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: LevelOrder
 * @Auther: yu
 * @Date: 2019/1/21 18:05
 * @Description: 二叉树的层次遍历
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        addLevel(list,0,root);
        return list;
    }

    public void addLevel(List<List<Integer>> list, int level, TreeNode node) {
        if (node == null) {
            return;
        }
        if (list.size() - 1 < level) {
            list.add(new ArrayList<>());
        }
        list.get(level).add(node.val);
        addLevel(list, level + 1, node.left);
        addLevel(list, level + 1, node.right);

    }
}
