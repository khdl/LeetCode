package com.liu.structure.linkedlist;

/**
 * @ClassName: RemoveElements
 * @Auther: yu
 * @Date: 2018/11/15 22:27
 * @Description:删除链表中等于给定值 val 的所有节点
 */
public class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode cur =  new ListNode(-1);
        ListNode  tmp = cur;
        while (head != null) {
            if (head.val == val) {
               cur.next = head.next;
            }else{
               cur.next = head;
               cur = cur.next;
            }
           head = head.next;
        }
        return tmp.next;
    }
}
