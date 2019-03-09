package com.liu.structure.arrayandstring.doublepointer;

/**
 * @ClassName: TwoSum
 * @Auther: yu
 * @Date: 2018/10/30 12:51
 * @Description:两数之和 II - 输入有序数组
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * 返回的下标值（index1 和 index2）不是从零开始的,可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素
 */
public class TwoSum {
    public static void main(String[] args){
       int[] numbers = {2, 7, 11, 15};
       int target =9;
       int[] res = twoSum(numbers,target);
       System.out.println(res[0]);
    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] res =new int[2];
        for(int i = 0;i< numbers.length;i++){
            for(int j = i+1;j<numbers.length;j++){
                if(numbers[i] + numbers[j] == target){
                    res[0] = i + 1;
                    res[1] = j + 1;
                    break;
                }
            }
        }
        return res;
    }
}
