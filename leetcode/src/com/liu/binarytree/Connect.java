package com.liu.binarytree;

/**
 * @ClassName: Connect
 * @Auther: yu
 * @Date: 2019/1/27 06:38
 * @Description: 每个节点的右向指针
 */
public class Connect {
    public void connect(TreeLinkNode root) {
        if(root==null){
            return;
        }
        if(root.left!=null){
            root.left.next = root.right;
            if(root.next!=null){
                root.right.next = root.next.left;
            }
        }
        connect(root.left);
        connect(root.right);
    }
}
