package com.liu.structure.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: IsIsomorphic
 * @Auther: yu
 * @Date: 2018/12/5 20:12
 * @Description:同构字符串
 * 给定两个字符串 s 和 t，判断它们是否是同构的
 */
public class IsIsomorphic {
    public static void main(String[] args){
       String a = "egg";
       String b = "add";
       isIsomorphic(a,b);
    }
    public static  boolean isIsomorphic(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Map<Character,Character> map = new HashMap<>();
        for (int i = 0; i <ss.length ; i++) {
            if(!map.containsKey(ss[i]) ){
                if(!map.containsValue(tt[i])){
                    map.put(ss[i],tt[i]);
                }else{
                    return false;
                }
            }
             if(!map.get(ss[i]).equals(tt[i])){
                 return  false;
             }
        }
        return true;
    }
}
