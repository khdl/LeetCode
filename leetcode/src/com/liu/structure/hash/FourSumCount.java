package com.liu.structure.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: FourSumCount
 * @Auther: yu
 * @Date: 2018/12/25 22:00
 * @Description: 四数相加 II
 * 给定四个包含整数的数组列表 A , B , C , D ,计算有多少个元组 (i, j, k, l) ，使得 A[i] + B[j] + C[k] + D[l] = 0。
 */
public class FourSumCount {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer,Integer> map = new HashMap<>();

        int count = 0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){
                map.put(A[i]+B[j],map.getOrDefault(A[i]+B[j],0)+1);
            }
        }

        for(int i=0;i<C.length;i++){
            for(int j=0;j<D.length;j++){
                count+= map.getOrDefault(-C[i]-D[j],0);
            }
        }
        return count;
    }
}
