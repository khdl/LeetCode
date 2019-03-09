package com.liu.structure.binarytree;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @ClassName: ContainsNear
 * @Auther: yu
 * @Date: 2019/2/13 21:02
 * @Description: 存在重复元素
 */
public class ContainsNear {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(k < 1 || t < 0 || nums.length <= 1) {
            return false;
        }
        //创建一个窗口
        SortedSet<Long> set=new TreeSet<Long>();
        for(int i=0;i<nums.length;i++) {
            Set<Long> subSet=set.subSet((long) nums[i]-t,(long) nums[i]+t+1);
            if(!subSet.isEmpty()) {
                return true;
            }
            if(i>=k) {
                set.remove((long) nums[i-k]);
            }
            set.add((long) nums[i]);
        }
        return false;
    }
}
