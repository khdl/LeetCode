package com.liu.structure.binarysearch;

/**
 * @ClassName: SearchIndex
 * @Auther: yu
 * @Date: 2019/1/3 21:35
 * @Description:  搜索旋转排序数组
 * 按照升序排序的数组在预先未知的某个点上进行了旋转，返回旋转下标值
 */
public class SearchIndex {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while(start <= end){
            if(target == nums[start]){
                return start;
            }
            if(target == nums[end]) {
                return end;
            }

            int middle = (start + end)/2;
            if(target == nums[middle]){
                return middle;
            }

            if(nums[start] > nums[middle]){
                if(target > nums[middle] && nums[start] > target) {
                    start = middle + 1;
                } else{
                    end = middle - 1;
                }
            } else {
                if(target < nums[middle] && target > nums[start]){
                    end = middle - 1;
                } else{
                    start = middle + 1;
                }
            }
        }
        return -1;

    }
}
