package com.liu.structure.linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: CopyRandomList
 * @Auther: yu
 * @Date: 2018/11/30 20:45
 * @Description: 复制带随机指针的链表
 * 给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点。返回这个链表的深度拷贝。
 */
public class CopyRandomList {
    public RandomListNode copyRandomList(RandomListNode head) {
        Map<RandomListNode,RandomListNode> map = new HashMap<>();
        RandomListNode cur = head;
        while (cur != null){
            RandomListNode node = new RandomListNode(cur.label);
            map.put(cur,node);
            cur = cur.next;
        }
        cur = head;
        while (cur != null){
            RandomListNode  node1 = map.get(cur);
            node1.next = map.get(cur.next);
            node1.random = map.get(cur.random);
            cur =cur.next;
        }

        return map.get(head);
    }
}

class RandomListNode {
    int label;
    RandomListNode next, random;
    RandomListNode(int x) {
        this.label = x;
    }
}