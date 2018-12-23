package com.liu.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: LengthOfLongestSubstring
 * @Auther: yu
 * @Date: 2018/12/23 18:54
 * @Description: 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args){
       String s = "abcbadca";
       new LengthOfLongestSubstring().lengthOfLongestSubstring(s);
    }
    public int lengthOfLongestSubstring(String s) {
      int res = 0;
      int n = s.length();
      Map<Character, Integer> map = new HashMap<>();
      int i = 0;
      for (int j = 0; j < n; j++) {
         if(map.containsKey(s.charAt(j))){
             i = Math.max(map.get(s.charAt(j)),i);
         }
         res = Math.max(res,j - i + 1);
         map.put(s.charAt(j), j + 1 );
      }
      return  res;
    }
}
