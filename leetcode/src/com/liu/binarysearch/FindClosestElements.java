package com.liu.binarysearch;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: FindClosestElements
 * @Auther: yu
 * @Date: 2019/1/9 18:15
 * @Description: 找到 K 个最接近的元素
 */
public class FindClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();
        int start = 0, end = arr.length-k;
        while(start<end){
            int mid = start + (end-start)/2;
            if(Math.abs(arr[mid]-x)>Math.abs(arr[mid+k]-x)){
                start = mid+1;
            } else {
                end = mid;
            }
        }
        for(int i=start; i<start+k; i++){
            res.add(arr[i]);
        }
        return res;
    }
}
