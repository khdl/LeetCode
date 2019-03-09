package com.liu.structure.linkedlist;

/**
 * @ClassName: RemoveNthFromEnd
 * @Auther: yu
 * @Date: 2018/11/15 21:39
 * @Description: 删除链表的倒数第N个节点
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * 思路：典型的双指针问题，前指针先走n步
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode second = head;

        for (int i = 0; i < n ; i++) {
            first = first.next;
        }
        if(first == null){
            return second.next;
        }
        while (first.next != null){
            first = first.next;
            second = second.next;
        }
        second.next =second.next.next;
      return head;
    }

}
