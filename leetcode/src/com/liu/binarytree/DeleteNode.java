package com.liu.binarytree;

import com.liu.queueandstack.stack.TreeNode;

/**
 * @ClassName: DeleteNode
 * @Auther: yu
 * @Date: 2019/2/11 09:06
 * @Description:  Delete Node in a BST
 */
public class DeleteNode {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return root;
        }
        if(key<root.val){
            root.left=deleteNode(root.left,key);
        } else if(root.val<key){
            root.right=deleteNode(root.right,key);
        }else{
            if(root.left != null && root.right != null){
                TreeNode tmp=findMin(root.right);
                root.val=tmp.val;
                root.right=deleteNode(root.right,root.val);
            }else{
                if(root.left==null){
                    root=root.right;
                } else{
                    root=root.left;
                }
            }
        }
        return root;
    }

    private TreeNode findMin(TreeNode root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
}
