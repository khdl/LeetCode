package com.liu.structure.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName: ConnectionTwo
 * @Auther: yu
 * @Date: 2019/1/27 06:41
 * @Description: 每个节点的右向指针 II
 */
public class ConnectionTwo {
    public void connect(TreeLinkNode root) {
        if(root == null){
            return;
        }
        Queue<TreeLinkNode> nodes = new LinkedList<>();
        nodes.offer(root);
        while(!nodes.isEmpty()){
            int size = nodes.size();
            for(int i = 0; i < size; i++){
                TreeLinkNode cur = nodes.poll();
                TreeLinkNode n = null;
                if(i < size - 1){
                    n = nodes.peek();
                }
                cur.next = n;
                if(cur.left != null){
                    nodes.offer(cur.left);
                }
                if(cur.right != null){
                    nodes.offer(cur.right);
                }
            }
        }
    }
}
