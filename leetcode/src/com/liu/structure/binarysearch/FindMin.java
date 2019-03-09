package com.liu.structure.binarysearch;

/**
 * @ClassName: FindMin
 * @Auther: yu
 * @Date: 2019/1/7 19:32
 * @Description: 寻找旋转排序数组中的最小值
 */
public class FindMin {
    public int findMin(int[] nums) {
      int left = 0;
      int right = nums.length - 1;
      while(left < right){
          int mid = (left + right) / 2;
          if(nums[mid] > nums[right]){
              left = mid + 1;
          }else{
              right = mid;
          }
      }
      return  nums[left];
    }
}
