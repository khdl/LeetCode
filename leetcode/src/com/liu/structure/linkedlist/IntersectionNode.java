package com.liu.structure.linkedlist;

/**
 * @ClassName: IntersectionNode
 * @Auther: yu
 * @Date: 2018/11/15 20:08
 * @Description:相交链表
 * 编写一个程序，找到两个单链表相交的起始节点。
 * 序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。
 * 在返回结果后，两个链表仍须保持原有的结构。
 */
public class IntersectionNode {

    /**
     * 思路：第一遍循环，找出两个链表的长度差N
     *       第二遍循环，长链表先走N步，然后同时移动，判断是否有相同节点
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return  null;
        }
        ListNode a = headA;
        ListNode b = headB;
        int countA = getCount(a);
        int countB = getCount(b);
        if(countA > countB){
            for (int i = 0; i <countA - countB ; i++) {
                a = a.next;
            }
        }else{
            for (int i = 0; i < countB - countA; i++) {
                b = b.next;
            }
        }
        while (a != null && b != null){
            if(a == b){
                return  a;
            }else{
                a = a.next;
                b = b.next;
            }
        }
        return null;
    }

    private int getCount(ListNode head) {
        int num = 0;
        while( head != null ){
            num++;
            head = head.next;
        }
        return  num;
    }
}
