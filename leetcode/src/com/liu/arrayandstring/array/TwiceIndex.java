package com.liu.arrayandstring.array;

/**
 * @ClassName: TwiceIndex
 * @Auther: yu
 * @Date: 2018/10/24 23:10
 * @Description:至少是其他数字两倍的最大数
 */
public class TwiceIndex {
    public static void main(String[] args){
        int[] nums = {3,6,1,2};
        int index = dominantIndex(nums);
        System.out.println(index);
    }

    public static  int dominantIndex(int[] nums) {
        int first = 0;
        int sencond = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= first){
                sencond =first;
                first =  nums[i];
                index = i;
            }
            if(nums[i] < first && nums[i] >= sencond ){
                sencond = nums[i];
            }
        }
        if(first >= sencond*2){
            return  index;
        }
        return  -1;
    }

}
