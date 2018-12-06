package com.liu.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: IntersectionTwo
 * @Auther: yu
 * @Date: 2018/12/6 20:43
 * @Description:两个数组的交集 II
 * 给定两个数组，编写一个函数来计算它们的交集。
 */
public class IntersectionTwo {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> tmp = new ArrayList<>();
        Map<Integer,Integer> num1 = new HashMap<>();
        Map<Integer,Integer> num2 = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if(num1.containsKey(nums1[i])){
                num1.put(nums1[i],num1.get(nums1[i])+1);
            }else{
                num1.put(nums1[i],1);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if(num2.containsKey(nums2[i])){
                num2.put(nums2[i],num2.get(nums2[i])+1);
            }else{
                num2.put(nums2[i],1);
            }
        }
        for (Integer i : num1.keySet()){
            if(num2.containsKey(i)){
                int m = num1.get(i) > num2.get(i) ? num2.get(i) : num1.get(i);
                for (int j = 0; j <m ; j++) {
                    tmp.add(i);
                }
            }
        }
        int[] res = new int[tmp.size()];
        for (int i = 0; i < tmp.size() ; i++) {
            res[i] = tmp.get(i);
        }
        return  res;
    }
}
