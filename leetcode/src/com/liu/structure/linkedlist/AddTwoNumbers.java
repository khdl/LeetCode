package com.liu.structure.linkedlist;

/**
 * @ClassName: AddTwoNumbers
 * @Auther: yu
 * @Date: 2018/11/28 22:27
 * @Description:两数相加
 * 给出两个 非空 的链表用来表示两个非负的整数。
 * 它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tmp = null;
        ListNode result = null;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            if(tmp == null){
                tmp = node;
                result = tmp;
            }else {
                tmp.next = node;
                tmp = tmp.next;
            }
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        return  result;
    }
}
