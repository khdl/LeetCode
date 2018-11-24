package com.liu.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: IsPalindrome
 * @Auther: yu
 * @Date: 2018/11/24 13:25
 * @Description 回文链表
 * 请判断一个链表是否为回文链表
 */
public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        List<Integer> nodeval = new ArrayList<>();
        if(head == null || head.next == null){
            return  true;
        }
        ListNode slow = head;
        ListNode fast = head;
        nodeval.add(0,slow.val);
        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            nodeval.add(0,slow.val);
        }
        ListNode  cur = slow;
        if(fast.next != null){
            cur = slow.next;
        }
        int i = 0;
        while (cur != null){
            if(nodeval.get(i) != cur.val){
                return  false;
            }
            cur = cur.next;
            i++;
        }
        return  true;
    }
}
