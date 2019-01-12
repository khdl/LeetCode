package com.liu.binarysearch;

/**
 * @ClassName: FindMinOne
 * @Auther: yu
 * @Date: 2019/1/12 13:50
 * @Description: 寻找旋转排序数组中的最小值 II
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。 注意数组中可能存在重复的元素。
 */
public class FindMinOne {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int start =0;
        int end = nums.length-1;
        //第一个数小于最后一个数，说明是完全升序
        if (nums[start]<nums[end]){
            return nums[start];
        }
        int middle=0;
        while (start<=end){
            middle = start +(end-start)/2;

            //让中位数和右边的数字比较
            if (nums[middle]>nums[end]){
                start = middle+1;
            }
            //如果 end = middle-1 的话，不能通过 {3,1,2}
            else if (nums[middle]<nums[end]){
                end = middle;
            }
            //如果中间和最后相等。怎么查找，主要前后移动方向不确定
            //无法确定的时候，让 右边的值自减就好了
            else {
                end--;
            }
        }
        return nums[start];
    }
}
