package com.liu.structure.arrayandstring.summary;

/**
 * @ClassName: FlipString
 * @Auther: yu
 * @Date: 2018/11/1 12:36
 * @Description: 反转字符串中的单词 III
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 */
public class FlipString {
    public static void main(String[] args){
        String s = "Let's take LeetCode contest";
        String res = reverseWords(s);
        System.out.println(res);
    }
    public static  String reverseWords(String s) {
        String res = "";
        String[] words = s.trim().split("\\s+");
        for (int i = 0; i < words.length ; i++) {
            String word = new StringBuilder(words[i]).reverse().toString();
            res = res +" "+ word;
        }
         return  res.trim();
    }
}
