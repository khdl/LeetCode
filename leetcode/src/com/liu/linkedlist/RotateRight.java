package com.liu.linkedlist;

/**
 * @ClassName: RotateRight
 * @Auther: yu
 * @Date: 2018/11/30 21:00
 * @Description:旋转链表
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 * 思路1： 用快慢指针（k的值超链表长度，先获得链表长度再取值）
 * 思路2;  一个指针，先获得链表长度，把链表头尾连接起来，往后走(n - k%n)结点断开链表
 */
public class RotateRight {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return null;
        }
        int n = 1;
        ListNode cur = head;
        while (cur.next != null){
            n++;
            cur = cur.next;
        }
        cur.next = head;
        int m = n - k%n;
        for (int i = 0; i < m ; i++) {
            cur = cur.next;
        }
        ListNode newHead = cur.next;
        cur.next = null;
        return  newHead;
    }
}
