package com.liu.structure.linkedlist;

/**
 * @ClassName: Flatten
 * @Auther: yu
 * @Date: 2018/11/29 23:03
 * @Description:  扁平化多级双向链表
 * 一个双向链表，除了下一个和前一个指针之外，它还有一个子指针，可能指向单独的双向链表。
 * 扁平化列表，使所有结点出现在单级双链表中。
 */
public class Flatten {
    public Node flatten(Node head) {
        if(head == null) {
            return  null;
        }
        Node p = head;
        while(p != null){
            if(p.child != null){
                Node next = p.next;
                Node nextlayer = flatten(p.child);
                p.next = nextlayer;
                nextlayer.prev = p;
                p.child = null;
                while (nextlayer.next != null){
                    nextlayer = nextlayer.next;
                }
                nextlayer.next = next;
                if(next != null){
                    next.prev = nextlayer;
                }
            }
            p = p.next;
        }
        return  head;
    }
}

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {}

    public Node(int _val,Node _prev,Node _next,Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
}