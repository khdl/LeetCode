package com.liu.structure.narytree;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Levelorder
 * @Auther: yu
 * @Date: 2019/2/17 19:59
 * @Description: N叉树的层序遍历
 */
public class Levelorder {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null){
            return res;
        }
        fillRes(root, 0, res);
        return res;
    }
    public void fillRes(Node root, int level, List<List<Integer>> res) {
        if(res.size() < level + 1){
            res.add(new ArrayList<Integer>());
        }
        res.get(level).add(root.val);
        for (Node n : root.children) {
            fillRes(n, level + 1, res);
        }
    }
}
