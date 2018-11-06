package com.liu.queueandstack.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName: MyStack
 * @Auther: yu
 * @Date: 2018/11/6 21:12
 * @Description: 实现栈
 * 动态数组足以实现栈结构
 */
public class MyStack {
    private List<Integer> data;

    public MyStack(){
        data = new ArrayList<>();
    }

    public  void  push(int x){
        data.add(x);
    }
    public  boolean isEmpty(){
        return  data.isEmpty();
    }
    public int top(){
        return  data.get(data.size() - 1);
    }
    public boolean pop(){
        if(isEmpty()){
            return  false;
        }
        data.remove(data.size() - 1);
        return true;
    }
      public static void main(String[] args){
          MyStack s = new MyStack();
          s.push(1);
          s.push(2);
          s.push(3);
          for (int i = 0; i < 4; ++i) {
              if (!s.isEmpty()) {
                  System.out.println(s.top());
              }
              System.out.println(s.pop());
          }
      }

      public void testStack(){
          Stack<Integer> stack = new Stack<>();
          stack.push(5);
          stack.push(11);
          stack.push(8);
          stack.push(6);
          stack.pop();

          System.out.println(stack.peek());
      }
}
