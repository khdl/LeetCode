package com.liu.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: SingleNumber
 * @Auther: yu
 * @Date: 2018/12/4 19:59
 * @Description:只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * HashSet的特性，删除重复的数组元素，最后剩下一个单独的元素，返回即可。
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(Integer i : nums){
            if(!set.add(i)){
                set.remove(i);
            }
        }
        return  set.iterator().next();

    }
}
