package com.liu.structure.arrayandstring.summary;

/**
 * @ClassName: RotatingArray
 * @Auther: yu
 * @Date: 2018/10/31 17:56
 * @Description:  旋转数组
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * 要求使用空间复杂度为 O(1) 的原地算法。
 */
public class RotatingArray {
    public static void main(String[] args){
       int[] a = {1,2,3,4,5,6,7};
       int k = 3;
       rotate(a,3);
    }
    public static  void rotate(int[] nums, int k) {
        while(k > nums.length){
            k -= nums.length;
        }
        int[] res = new int[k];
        int q = 0;
        for (int i = nums.length -k; i <nums.length ; i++) {
            res[q] = nums[i];
            q++;
        }
        for (int i = nums.length - k -1; i >= 0 ; i--) {
            nums[i+k]  = nums[i];
        }
        for (int i = 0; i < res.length; i++) {
            nums[i] = res[i];
        }
    }
}
