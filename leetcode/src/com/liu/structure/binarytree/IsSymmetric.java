package com.liu.structure.binarytree;

import com.liu.structure.queueandstack.stack.TreeNode;

/**
 * @ClassName: IsSymmetric
 * @Auther: yu
 * @Date: 2019/1/24 16:49
 * @Description: 对称二叉树
 * 给定一个二叉树，检查它是否是镜像对称的。
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return check(root.left,root.right);
    }
    public boolean check(TreeNode rootLeft,TreeNode rootRight){
        if(rootLeft==null && rootRight==null){
            return true;
        }
        if(rootLeft==null || rootRight==null){
            return false;
        }
        //比较相同位置的值是否相等
        if(rootLeft.val != rootRight.val){
            return false;
        }
        //传入左子树的左节点，右子树的右节点
        if(!check(rootLeft.left,rootRight.right)){
            return false;
        }
        //传入左子树的右节点，右子树的左节点
        if(!check(rootLeft.right,rootRight.left)){
            return false;
        }
        return true;
    }

}
