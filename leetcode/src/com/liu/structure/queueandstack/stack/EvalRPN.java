package com.liu.structure.queueandstack.stack;

import java.util.Stack;

/**
 * @ClassName: EvalRPN
 * @Auther: yu
 * @Date: 2018/11/7 21:55
 * @Description:  逆波兰表达式求值
 * 根据逆波兰表示法，求表达式的值。
 * 有效的运算符包括 +, -, *, / 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
 * 思路：就是遇到数字入栈，遇到符号出栈两个数进行计算，把计算结果再入栈
 */
public class EvalRPN {
    public static void main(String[] args){
       String[] tokens = {"2", "1", "+", "3", "*"};
       int res = evalRPN(tokens);
       System.out.println(res);
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer>  stack = new Stack<>();
        if(tokens.length == 0){
            return  0;
        }
        for (int i = 0; i < tokens.length ; i++) {
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*")  || tokens[i].equals("/")){
                if(tokens[i].equals("+")){
                    int num1 = stack.peek();
                    stack.pop();
                    int num2 = stack.peek();
                    stack.pop();
                    stack.push(num1 + num2);
                }
                if(tokens[i].equals("-")){
                    int num1 = stack.peek();
                    stack.pop();
                    int num2 = stack.peek();
                    stack.pop();
                    stack.push(num2 - num1);
                }
                if(tokens[i].equals("*")){
                    int num1 = stack.peek();
                    stack.pop();
                    int num2 = stack.peek();
                    stack.pop();
                    stack.push(num1 * num2);
                }
                if(tokens[i].equals("/")){
                    int num1 = stack.peek();
                    stack.pop();
                    int num2 = stack.peek();
                    stack.pop();
                    stack.push( num2/num1);
                }
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return  stack.peek();
    }
}
