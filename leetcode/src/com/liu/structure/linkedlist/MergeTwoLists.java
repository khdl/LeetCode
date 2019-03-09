package com.liu.structure.linkedlist;

/**
 * @ClassName: MergeTwoLists
 * @Auther: yu
 * @Date: 2018/11/27 22:38
 * @Description: 合并两个有序链表
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node;
        if(l1 == null || l2 == null){
          return l1 == null? l2 :l1;
         }else{
             if(l1.val < l2.val){
                  node = new ListNode(l1.val);
                  l1 = l1.next;
                  node.next = mergeTwoLists(l1,l2);
              }else{
                  node = new ListNode(l2.val);
                  l2 = l2.next;
                  node.next = mergeTwoLists(l1,l2);
             }
          return  node;
      }
    }
}
