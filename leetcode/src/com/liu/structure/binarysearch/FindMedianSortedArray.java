package com.liu.structure.binarysearch;

/**
 * @ClassName: FindMedianSortedArray
 * @Auther: yu
 * @Date: 2019/1/15 18:53
 * @Description:  寻找两个有序数组的中位数
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 */
public class FindMedianSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        if (m < n) {
            return findMedianSortedArrays(nums2, nums1);
        }
        if (n == 0){
            return (nums1[(m - 1) / 2] + nums1[m / 2]) / 2.0;
        }
        int left = 0, right = 2 * n;
        while (left <= right) {
            int mid2 = (left + right) / 2;
            int mid1 = m + n - mid2;
            double L1 = mid1 == 0 ? Double.MIN_VALUE : nums1[(mid1 - 1) / 2];
            double L2 = mid2 == 0 ? Double.MIN_VALUE : nums2[(mid2 - 1) / 2];
            double R1 = mid1 == m * 2 ? Double.MAX_VALUE : nums1[mid1 / 2];
            double R2 = mid2 == n * 2 ? Double.MAX_VALUE : nums2[mid2 / 2];
            if (L1 > R2){
                left = mid2 + 1;
            }
            else if (L2 > R1) {
                right = mid2 - 1;
            }
            else{
                return (Math.max(L1, L2) + Math.min(R1, R2)) / 2;
            }
        }
        return -1;
    }
}
