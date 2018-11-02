package com.liu.queueandstack.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName: JavaQueue
 * @Auther: yu
 * @Date: 2018/11/2 8:57
 * @Description: java 内置的队列
 */
public class JavaQueue {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        //peek()获取队列的第一个元素,没元素返回null
        System.out.println("The first element is: " + q.peek());
        //offer() 入队
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        //poll() 出队
        q.poll();
        System.out.println("The first element is: " + q.peek());
        System.out.println("The size is: " + q.size());
    }
}
