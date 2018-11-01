package com.liu.arrayandstring.summary;

/**
 * @ClassName: MoveZero
 * @Auther: yu
 * @Date: 2018/11/1 13:09
 * @Description:移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 */
public class MoveZero {
    public static void main(String[] args){
        int[] nums =  {0,1,0,3,12};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int k = 0;
        int n = 0;
        for (int  i = 0;  i < nums.length;  i++) {
            if(nums[i] != 0){
                nums[k] = nums[i];
                k++;
            }else{
                n++;
            }
        }
        for (int i = n; i > 0 ; i--) {
            nums[nums.length-i] = 0;
        }
    }
}
