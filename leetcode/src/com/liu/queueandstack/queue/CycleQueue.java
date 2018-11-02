package com.liu.queueandstack.queue;

/**
 * @ClassName: CycleQueue
 * @Auther: yu
 * @Date: 2018/11/1 18:36
 * @Description: 设计循环队列
 */
public class CycleQueue {
    private  int [] items;
    private  int n = 0;
    private  int head = -1;
    private  int tail = -1;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public CycleQueue(int k) {
        items = new int[k];
        n = k;
    }

    public boolean enQueue(int value) {
        if (isFull() == true) {
            return false;
        }
        if (isEmpty() == true) {
            head = 0;
        }
      tail = (tail + 1) % n;
      items[tail] = value;
      return  true;
    }


    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        if (head == tail) {
            head = -1;
            tail = -1;
            return true;
        }
      head = (head + 1) % n;
      return  true;

    }

    public int Front() {
        if (isEmpty() == true) {
            return -1;
        }
        return items[head];
    }

    public int Rear() {
        if (isEmpty() == true) {
            return -1;
        }
        return items[tail];
    }


    public boolean isEmpty() {
        return head == -1;
    }


    public boolean isFull() {
        return ((tail + 1) % n) == head;
    }
}
