package com.liu.structure.linkedlist;

/**
 * @ClassName: ListNode
 * @Auther: yu
 * @Date: 2018/11/25 20:51
 * @Description:  单链表
 * 不能在常量级的时间内访问随机位置.
 * 必须从头部遍历才能得到我们想要的第一个结点。
 * 最坏的情况下，时间复杂度将是 O(N)，其中 N 是链表的长度。
 *
 */
public class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
}
