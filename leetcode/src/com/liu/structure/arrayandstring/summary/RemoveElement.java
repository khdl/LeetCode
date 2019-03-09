package com.liu.structure.arrayandstring.summary;

/**
 * @ClassName: RemoveElement
 * @Auther: yu
 * @Date: 2018/11/1 12:52
 * @Description: 删除排序数组中的重复项
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 */
public class RemoveElement {
    public static void main(String[] args){
        int[] nums = {1,1,2};
        int res = removeDuplicates(nums);
        System.out.println(res);

    }
    public static  int removeDuplicates(int[] nums) {
        int res = 0;
        if(nums.length == 0){
          return  0;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[res] != nums[i]){
                res++;
                nums[res] = nums[i];
            }

        }
        res++;
       return res;
    }
}
