package com.liu.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: ContainsDuplicate
 * @Auther: yu
 * @Date: 2018/12/4 19:56
 * @Description:存在重复元素
 *给定一个整数数组，判断是否存在重复元素。
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
         Set<Integer> set = new HashSet<>();
         for(Integer i : nums){
             if(set.contains(i)){
                 return  true;
             }
             set.add(i);
         }
         return  false;
    }
}
