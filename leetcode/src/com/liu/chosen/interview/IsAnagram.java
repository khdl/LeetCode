package com.liu.chosen.interview;

import java.util.Arrays;

/**
 * @className: IsAnagram
 * @author: yu.liu
 * @date: 2019/8/18 21:30
 * @description: 有效的字母异位词
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 */
public class IsAnagram {
    public boolean isAnagram(String s, String t) {
      if(s.length() != t.length()){
          return false;
      }
      char[] ss = s.toCharArray();
      char[] tt = t.toCharArray();
      Arrays.sort(ss);
      Arrays.sort(tt);
      for (int i = 0; i < ss.length ; i++) {
          if(ss[i] != tt[i]){
              return false;
          }
      }
      return true;
    }
}
