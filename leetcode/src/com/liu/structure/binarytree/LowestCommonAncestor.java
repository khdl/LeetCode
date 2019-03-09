package com.liu.structure.binarytree;

import com.liu.structure.queueandstack.stack.TreeNode;

/**
 * @ClassName: LowestCommonAncestor
 * @Auther: yu
 * @Date: 2019/1/29 17:53
 * @Description:   二叉树的最近公共祖先
 */
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      if(root == null || root == p || root == q){
          return  root;
      }
      TreeNode left = lowestCommonAncestor(root.left, p, q);
      TreeNode right = lowestCommonAncestor(root.right, p, q);
      if(left != null && right != null){
          return  root;
      }
      return  left == null ? right : left;
    }
}
