package com.liu.structure.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: ContainsDuplicateTwo
 * @Auther: yu
 * @Date: 2018/12/6 21:00
 * @Description:存在重复元素 II
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，
 * 并且 i 和 j 的差的绝对值最大为 k。
 */
public class ContainsDuplicateTwo {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                int sub = i - map.get(nums[i]);
                if(sub <= k){
                    return true;
                }else{
                    map.put(nums[i],i);
                }
            }else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
