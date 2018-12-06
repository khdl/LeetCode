package com.liu.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @ClassName: FirstUniqChar
 * @Auther: yu
 * @Date: 2018/12/6 20:26
 * @Description: 字符串中的第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 */
public class FirstUniqChar {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
             if(map.containsKey(chars[i])){
                 map.put(chars[i],map.get(chars[i])+1);
             }else {
                 map.put(chars[i],1);
             }
        }
        int min = Integer.MAX_VALUE;
        for(Character m : map.keySet()){
            if(map.get(m) == 1 && s.indexOf(m) < min){
                min = s.indexOf(m);
            }
        }
        if(min != Integer.MAX_VALUE){
            return  min;
        }
        return -1;
    }
}
