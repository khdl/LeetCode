package com.liu.binarysearch;

/**
 * @ClassName: SplitArray
 * @Auther: yu
 * @Date: 2019/1/19 22:42
 * @Description: 分割数组的最大值
 *  给定一个非负整数数组和一个整数 m，你需要将这个数组分成 m 个非空的连续子数组。
 *  设计一个算法使得这 m 个子数组各自和的最大值最小。
 */
public class SplitArray {
    public int splitArray(int[] nums, int m) {
        int size=nums.length;
        double[][] arr=new double[m][size];
        long sum=0;
        for(int i=0;i<size;i++){
            sum+=nums[i];
            arr[0][i]=sum;
        }
        for(int i=1;i<m;i++){
            for(int j=size-1;j>=i;j--){
                sum=0;
                arr[i][j]=Integer.MAX_VALUE;
                for(int k=j;k>=i;k--){
                    sum+=nums[k];
                    double temp=(sum<arr[i-1][k-1])?arr[i-1][k-1]:sum;
                    if(arr[i][j]>temp) {
                        arr[i][j]=temp;
                    }
                }
            }
        }
        int result=(int)arr[m-1][size-1];
        return result;
    }
}
