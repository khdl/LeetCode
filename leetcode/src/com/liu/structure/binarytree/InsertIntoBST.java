package com.liu.structure.binarytree;

import com.liu.structure.queueandstack.stack.TreeNode;

/**
 * @ClassName: InsertIntoBST
 * @Auther: yu
 * @Date: 2019/2/11 08:58
 * @Description: Insert into a Binary Search Tree
 */
public class InsertIntoBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
      if(root == null){
          return  new TreeNode(val);
      }
      if(val > root.val){
          root.right = insertIntoBST(root.right,val);
      }else{
          root.left = insertIntoBST(root.left,val);
      }
      return root;
    }
}
