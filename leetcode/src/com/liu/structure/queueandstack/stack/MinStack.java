package com.liu.structure.queueandstack.stack;

import java.util.Stack;

/**
 * @ClassName: MInStack
 * @Auther: yu
 * @Date: 2018/11/6 21:25
 * @Description: 最小栈
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 */
public class MinStack {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public static void main(String[] args){
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin();
        minStack.pop();
        minStack.top();      
        minStack.getMin();
        System.out.println();
    }
    public  void  push(int x){
        s1.push(x);
        if(s2.isEmpty() || s2.peek() >= x){
            s2.push(x);
        }
    }

    public void pop(){
        int x = s1.pop();
        if(s2.peek() == x){
            s2.pop();
        }
    }

    public  int top(){
        return  s1.peek();
    }

    public  int getMin(){
        return s2.peek();
    }
}
