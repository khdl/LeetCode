package com.liu.structure.binarysearch;

/**
 * @ClassName: SearchRange
 * @Auther: yu
 * @Date: 2019/1/8 23:02
 * @Description: 在排序数组中查找元素的第一个和最后一个位置
 *  注意处理好边界
 */
public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int i = 0, j = nums.length;
        int mid = (i + j) / 2;

        int p = -1;
        while (i < j) {
            if (nums[mid] == target) {
                p = mid;
                break;
            }
            if (nums[mid] > target) {
                if (j == mid) {
                    break;
                }
                j = mid;
                mid = (i + j) / 2;
            } else {
                if (i == mid) {
                    break;
                }
                i = mid;
                mid = (i + j) / 2;
            }
        }

        if (p == -1) {
            return new int[]{-1, -1};
        } else {
            int a = p, b = p;
            while (a > 0 && nums[a - 1] == target){
                a--;
            }
            while (b < nums.length - 1 && nums[b + 1] == target) {
                b++;
            }
            return new int[]{a, b};
        }
    }
}
