package com.liu.structure.queueandstack.stack;

/**
 * @ClassName: FindTargetSumWays
 * @Auther: yu
 * @Date: 2018/11/8 12:38
 * @Description: 目标和
 * 给定一个非负整数数组，a1, a2, ..., an, 和一个目标数，S。有两个符号 + 和 -。
 * 返回可以使最终数组和为目标数 S 的所有添加符号的方法数。
 */
public class FindTargetSumWays {
    public static void main(String[] args){
     int[] nums ={1,1,1,1,1};
     int S = 3;
     int res = findTargetSumWays(nums,S);
     System.out.println(res);
    }
    public static  int findTargetSumWays(int[] nums, int S) {
        int[] res = new int[1];
        helper(nums,S,0,res);
        return res[0];
    }
    public  static void helper(int[] nums, int S, int start, int[] res) {
        if(start == nums.length){
            if(S == 0){
                res[0] = res[0] +1;
            }
            return;
        }
        helper(nums,S - nums[start],start+1,res);
        helper(nums,S + nums[start],start+1,res);
    }
}
