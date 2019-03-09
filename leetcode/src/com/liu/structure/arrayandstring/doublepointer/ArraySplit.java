package com.liu.structure.arrayandstring.doublepointer;

import java.util.Arrays;

/**
 * @ClassName: ArraySplit
 * @Auther: yu
 * @Date: 2018/10/30 12:32
 * @Description: 数组拆分
 * 给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ,
 * 使得从1 到 n 的 min(ai, bi) 总和最大
 * 思路：将两个差不多的值分为一组，这样min函数会损失的最少
 */
public class ArraySplit {
    private int res;

    public static void main(String[] args){
       int[]  a = {1,4,3,2};
       int res = arrayPairSum(a);
        System.out.println(res);
    }
    public static int arrayPairSum(int[] nums) {
       int res = 0;
       Arrays.sort(nums);
       for (int i = 0; i <nums.length; i =i+2) {
           res+=nums[i];
       }
       return  res;
    }
}
