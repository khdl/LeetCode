package com.liu.structure.arrayandstring.doublepointer;

/**
 * @ClassName: MaxContinuous
 * @Auther: yu
 * @Date: 2018/10/30 18:44
 * @Description: 最大连续1的个数
 *  给定一个二进制数组， 计算其中最大连续1的个数。
 *  输入的数组只包含 0 和1。输入数组的长度是正整数，且不超过 10,000。
 */
public class MaxContinuous {
    public static void main(String[] args){
        int[] a = {1};
        int res = findMaxConsecutiveOnes(a);
        System.out.println(res);
    }
    public static  int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int k =0;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]== 1){
                k++;
            }else{
                k = 0;
            }
            if(k>res){
                res = k;
            }
        }
        return  res;
    }
}
