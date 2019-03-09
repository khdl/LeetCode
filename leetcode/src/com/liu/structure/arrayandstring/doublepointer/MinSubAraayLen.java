package com.liu.structure.arrayandstring.doublepointer;

/**
 * @ClassName: MinSubAraayLen
 * @Auther: yu
 * @Date: 2018/10/30 19:43
 * @Description: 长度最小的子数组
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组。
 * 如果不存在符合条件的连续子数组，返回 0。
 */
public class MinSubAraayLen {
    public static void main(String[] args){
        int[] a ={2,3,1,2,4,3};
        int s = 7;
        int res = minSubArrayLen(s,a);
        System.out.println(res);
    }
    public static int minSubArrayLen(int s, int[] nums) {
        int i = 0;
        int k = -1;
        int res = nums.length +1;
        int sum = 0;
        while (i < nums.length) {
           if(k +1< nums.length && sum <s){
               k+=1;
               sum += nums[k];
           }else {
               sum -= nums[i];
               i++;
           }
           if (sum >= s)
              res = Math.min(res, k-i +1);
         }
         if(res == nums.length+1){
            return 0;
         }
       return  res;
    }

}
