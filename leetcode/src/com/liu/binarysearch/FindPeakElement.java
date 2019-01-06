package com.liu.binarysearch;

/**
 * @ClassName: FindPeakElement
 * @Auther: yu
 * @Date: 2019/1/6 16:31
 * @Description: 寻找峰值
 *  峰值元素是指其值大于左右相邻值的元素。 数组可能包含多个峰值，在这种情况下，返回任何一个峰值所在位置即可。
 */
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1) {
            return 0;
        }
        int size = nums.length, low = 0, high = size-1, mid = 0;
        while(low <= high) {
            mid = (high - low) / 2 + low;
            if(nums[mid] > (mid - 1 < 0 ? Integer.MIN_VALUE : nums[mid - 1]) &&
                    nums[mid] > (mid + 1 > size  - 1 ? Integer.MIN_VALUE : nums[mid + 1])) {
                return mid;
            }
            else if(nums[mid] < (mid - 1 < 0 ? Integer.MIN_VALUE : nums[mid - 1])) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return  -1;
    }
}
