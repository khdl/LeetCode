package com.liu.structure.binarysearch;

/**
 * @ClassName: FindDuplicate
 * @Auther: yu
 * @Date: 2019/1/13 19:40
 * @Description: 寻找重复数
 * 给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。
 * 假设只有一个重复的整数，找出这个重复的数。
 */
public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        int duplicate=-1;
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=i){
                if(nums[i]==nums[nums[i]]){
                    duplicate= nums[i];
                    break;
                }else{
                    int temp=nums[i];
                    nums[i]=nums[temp];
                    nums[temp]=temp;
                }
                if(duplicate!=-1){
                    break;
                }
            }
        }
        return duplicate;
    }
}
