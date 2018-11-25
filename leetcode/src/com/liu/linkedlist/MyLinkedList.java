package com.liu.linkedlist;

/**
 * @ClassName: MyLinkedList
 * @Auther: yu
 * @Date: 2018/11/13 20:23
 * @Description: 设计链表
 */
public class MyLinkedList {
    ListNode head =null;
    public  MyLinkedList(){
        head = new ListNode(0);
    }
    public int get(int index){
        ListNode cur = head.next;
        int num = -1;
        while (cur != null){
            num ++;
            if(num == index){
                return cur.val;
            }
            cur= cur.next;
        }
        return -1;
    }

    public  void  addAtHead(int val){
        ListNode node = new ListNode(val);
        node.next = head.next;
        head.next = node;
    }
    public  void  addAtTail(int val){
        ListNode cur = head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = new ListNode(val);
    }

    public void addAtIndex(int index, int val){
        ListNode cur = head;
        int num = -1;
        while (cur != null){
            num++;
            if( num == index){
                ListNode node = new ListNode(val);
                node.next = cur.next;
                cur.next = node;
            }
            cur = cur.next;
        }
    }

    public  void  deleteAtindex(int index){
        ListNode cur = head;
        int num = -1;
        while (cur.next != null){
            num++;
            if(num == index){
                ListNode temp = cur.next;
                cur.next = cur.next.next;
                break;
            }
            cur = cur.next;
        }
    }
}


