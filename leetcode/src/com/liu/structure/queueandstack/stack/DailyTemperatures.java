package com.liu.structure.queueandstack.stack;

import java.util.Stack;

/**
 * @ClassName: DailyTemperatures
 * @Auther: yu
 * @Date: 2018/11/6 22:10
 * @Description:每日温度
 * 据每日 气温 列表，请重新生成一个列表，对应位置的输入是你需要再等待多久温度才会升高的天数。
 * 如果之后都不会升高，请输入 0 来代替。
 */
public class DailyTemperatures {
    public static void main(String[] args){
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] res = dailyTemperatures(temperatures);
        System.out.println(res);

    }
    public static  int[] dailyTemperatures(int[] temperatures) {
       if(temperatures == null || temperatures.length == 0){
           return null;
       }
        int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < temperatures.length; i++) {
             while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                 int idx = stack.pop();
                 res[idx] = i - idx;
             }
            stack.push(i);
        }
       return  res;

    }

}
