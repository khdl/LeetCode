package com.liu.hash;

import java.util.*;

/**
 * @ClassName: Intersection
 * @Auther: yu
 * @Date: 2018/12/4 20:07
 * @Description: 两个数组的交集
 * 给定两个数组，编写一个函数来计算它们的交集。
 */
public class Intersection {
    public static void main(String[] args){
       int[] a = {1,2,2,1};
       int[] b = {2,2};
       intersection(a,b);
    }
    public static  int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> tmp = new HashSet<>();
        Set<Integer>  set = new HashSet<>();
        for(Integer i : nums1){
            if(set.contains(i)){
                continue;
            }
            set.add(i);
        }
        for(Integer i : nums2){
            if(set.contains(i) && !tmp.contains(i)){
                tmp.add(i);
            }
        }
        int[] res = new int[tmp.size()];
        int  i = 0;
        Iterator it = tmp.iterator();
        while (it.hasNext()){
            res[i++] = (int) it.next();
        }
        return res;
    }
}
