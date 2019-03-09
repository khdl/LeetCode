package com.liu.structure.binarysearch;

import java.util.Arrays;

/**
 * @ClassName: SmallestDistancePair
 * @Auther: yu
 * @Date: 2019/1/17 22:01
 * @Description: 找出第 k 小的距离对
 * 给定一个整数数组，返回所有数对之间的第 k 个最小距离。一对 (A, B) 的距离被定义为 A 和 B 之间的绝对差值。
 */
public class SmallestDistancePair {
    public int smallestDistancePair(int[] nums, int k) {
        //注意这里，对数组进行排序处理
        Arrays.sort(nums);
        int len = nums.length;
        int left = 0, right = nums[len - 1] - nums[0];

        while(left < right){
            int mid = left + (right - left) / 2;
            int count = getCount(nums, mid);
            //注意这里的二分查找左边界和右边界更新的标准
            //小于k，mid必然非最终解，因此left = mid + 1
            //大于等于k，可以将mid作为候选解
            if(count < k)  {
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }
    public int getCount(int[] nums, int mid){
        int count = 0;
        int left = 0;
        //注意这里的left，在迭代的过程中没有重置，而是一直右移
        //很容易理解，i右移，nums[i]变大(注意对数组进行过排序)，而nums[left](上一轮的)不变
        //因此差增大，必然还是比mid大，因此不需要再迭代一遍
        for(int i = 1; i < nums.length;i++){
            while(nums[i] - nums[left] > mid)   {
                left++;
            }
            count += i - left;
        }
        return count;
    }

}
