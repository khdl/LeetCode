package com.liu.structure.arrayandstring.doublepointer;

/**
 * @ClassName: RemoveElement
 * @Auther: yu
 * @Date: 2018/10/30 13:08
 * @Description: 双指针技巧
 *  场景之二同时有一个慢指针和一个快指针。关键是：确定两个指针的移动策略。
 */
public class  RemoveElement {
    public static void main(String[] args){
     int[] a = {1,23,4,5,4,7,4,9};
     int res = remove(a,4);
     System.out.println(res);
    }

    /**
     * 删除数组中某个特定的值
     * @param nums
     * @param val
     * @return 删除后数组的长度
     */
    public static int remove(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
