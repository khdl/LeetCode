package com.liu.structure.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: TwoSum
 * @Auther: yu
 * @Date: 2018/12/5 20:00
 * @Description:两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的 两个 整数
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            if(map.containsKey(target-nums[i])){
                res[0] = i;
                res[1] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i],i);
        }
        return  res;
    }
}
