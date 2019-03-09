package com.liu.structure.linkedlist;

/**
 * @ClassName: OldEvenlist
 * @Auther: yu
 * @Date: 2018/11/22 20:23
 * @Description: 奇偶链表
 * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。
 */
public class OldEvenlist {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return head;
        }
        ListNode odd_h = head;
        ListNode odd_t = head;
        ListNode even_h = head.next;
        ListNode even_t = head.next;
        while (even_t != null && even_t.next != null){
            odd_t.next = even_t.next;
            odd_t = odd_t.next;

            even_t.next = odd_t.next;
            even_t = even_t.next;
        }
        odd_t.next = even_h;
        return odd_h;
    }
}
