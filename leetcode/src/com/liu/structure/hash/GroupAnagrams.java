package com.liu.structure.hash;

import java.util.*;

/**
 * @ClassName: GroupAnagrams
 * @Auther: yu
 * @Date: 2018/12/8 11:27
 * @Description: 字母异位词分组
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return  new ArrayList<>();
        }
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return  new ArrayList<>(map.values());

    }
}
