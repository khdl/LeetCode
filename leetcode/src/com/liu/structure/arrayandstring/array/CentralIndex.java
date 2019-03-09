package com.liu.structure.arrayandstring.array;

/**
 * @ClassName: CentralIndex
 * @Auther: yu
 * @Date: 2018/10/23 22:01
 * @Description:寻找数组的中心索引
 * 定义数组中心索引的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
 * 如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。
 */
public class CentralIndex {
    public static void main(String[] args){
       int[] nums = {0,0,1,2};
       int index = pivotIndex(nums);
        System.out.println(index);
    }
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int left= 0;
        int right = 0;
        for(int item :nums){
            sum+=item;
        }
        for(int i = 0; i < nums.length ;i++){
            if(i == 0){
                left = 0;
            }else{
                left +=nums[i-1];
            }
            right = sum - nums[i] - left;
            if(left == right){
                return i;
            }
        }
        return  -1;
    }
}
