package com.liu.hash;

import java.util.*;

/**
 * @ClassName: TopKFrequent
 * @Auther: yu
 * @Date: 2018/12/27 20:15
 * @Description: 前K个高频元素
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 */
public class TopKFrequent {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        Set<Map.Entry<Integer,Integer>> set = map.entrySet();

        for (Map.Entry<Integer,Integer> entry : set){
            pq.add(entry);
        }
        for (int i = 0; i < k; i++){
            list.add(pq.poll().getKey());
        }
         return  list;
    }
}
