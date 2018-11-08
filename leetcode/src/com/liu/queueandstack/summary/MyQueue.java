package com.liu.queueandstack.summary;

import java.util.Stack;

/**
 * @ClassName: MyQueue
 * @Auther: yu
 * @Date: 2018/11/8 20:46
 * @Description: 用栈实现队列
 */
public class MyQueue {
    Stack<Integer>  s1 = new Stack<>();
    Stack<Integer>  s2 = new Stack<>();
    public  MyQueue(){

    }

    public  void push(int x){
         while(!s2.empty()){
             s1.push(s2.peek());
             s2.pop();
         }
         s2.push(x);
         while (!s1.isEmpty()){
             s2.push(s1.peek());
             s1.pop();
         }
    }

    public int pop(){
        int a = s2.peek();
        s2.pop();
        return a;
    }

    public  int  peek(){
        return  s2.peek();
    }

    public  boolean empty(){
        return  s2.empty();
    }

}
