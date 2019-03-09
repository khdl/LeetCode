package com.liu.structure.binarytree;

import com.liu.structure.queueandstack.stack.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: PreorderTraversal
 * @Auther: yu
 * @Date: 2019/1/20 21:54
 * @Description:  二叉树的前序遍历
 * 中序、后序改变值加入顺序
 */
public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return  result;
        }
         helper(result,root);
         return  result;
    }

    private void helper(List<Integer> result, TreeNode root) {
        if(root == null){
            return ;
        }
        result.add(root.val);
        helper(result,root.left);
        helper(result,root.right);
    }
}
