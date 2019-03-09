package com.liu.structure.queueandstack.summary;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName: MyStack
 * @Auther: yu
 * @Date: 2018/11/8 21:18
 * @Description: 用队列实现栈
 */
public class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public  void push(int x){
        while(!q2.isEmpty()){
            q1.offer(q2.peek());
            q2.poll();
        }
        q2.offer(x);
        while(!q1.isEmpty()){
            q2.offer(q1.peek());
            q1.poll();
        }
    }

       public  int  pop(){
            return  q2.poll();
       }

       public  int top(){
            return  q2.peek();
       }

       public  boolean empty(){
            return q2.isEmpty();
       }
}
