package com.liu.linkedlist;

import java.util.Objects;

/**
 * @ClassName: HasCycle
 * @Auther: yu
 * @Date: 2018/11/13 20:51
 * @Description: 环形链表
 */
public class CycleLinkedList {
    /**
     * 给定一个链表，判断链表中是否有环。
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if(Objects.isNull(head) || Objects.isNull(head.next)){
            return  false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (Objects.nonNull(fast)){
            if(slow == fast){
                return true;
            }
            slow = slow.next;
            if(Objects.isNull(fast.next)){
                return  false;
            }
            fast = fast.next.next;
        }
        return  false;
    }

    /**
     * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next ==null){
            return null;
        }
        ListNode slowIndex = head;
        ListNode fastIndex = head;

        while (fastIndex != null && fastIndex.next != null){
            slowIndex =slowIndex.next;
            fastIndex =fastIndex.next.next;

            if (slowIndex == fastIndex){
                slowIndex = head;

                while (slowIndex != fastIndex){
                    slowIndex = slowIndex.next;
                    fastIndex =fastIndex.next;
                }
                return slowIndex;
            }
        }
        return null;
    }
}


