package com.liu.structure.hash;

import java.util.*;

/**
 * @ClassName: FindDuplicateSubtrees
 * @Auther: yu
 * @Date: 2018/12/15 10:09
 * @Description: 寻找重复的子树
 *  给定一棵二叉树，返回所有重复的子树。对于同一类的重复子树，你只需要返回其中任意一棵的根结点即可。
 */
public class FindDuplicateSubtrees {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
         List<TreeNode> res = new LinkedList<>();
         Map<String, Integer> map = new HashMap<>();
         helper(root, map, res);
         return  res;
    }

    private String helper(TreeNode cur, Map<String, Integer> map, List<TreeNode> res) {
        if(cur == null){
            return "#";
        }
        //将二叉树的信息转化为string
        String serial = cur.val + "," + helper(cur.left, map, res) + "," + helper(cur.right, map, res);
        //将节点加入list
        if(map.getOrDefault(serial, 0) == 1){
            res.add(cur);
        }
        //更新map
        map.put(serial, map.getOrDefault(serial, 0) + 1);
        return serial;
    }
}

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }