package com.liu.arrayandstring.summary;

/**
 * @ClassName: FlipWord
 * @Auther: yu
 * @Date: 2018/11/1 8:44
 * @Description: 翻转字符串里的单词
 * 给定一个字符串，逐个翻转字符串中的每个单词
 */
public class FlipWord {
    public static void main(String[] args){
        String s = "the sky is blue";
        System.out.println(s.trim());
        String res = reverseWords(s);
        System.out.println(res);
    }
    public static String reverseWords(String s) {
        String res = "";
        String[] words = s.trim().split("\\s+");
        for (int i = words.length - 1; i >= 0 ; i--) {
            res = res +" "+words[i];

        }
        return  res.trim();
    }
}
