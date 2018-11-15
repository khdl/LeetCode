package com.liu.linkedlist;

/**
 * @ClassName: ReverseList
 * @Auther: yu
 * @Date: 2018/11/15 22:00
 * @Description: 反转链表
 * 反转一个单链表。
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
         ListNode first = head;
         ListNode res =null;
          while (first != null){
              ListNode tmp =first.next;
              first.next = res;                      ;
              res = first;
              first = tmp;

          }
        return  res;
    }
}
