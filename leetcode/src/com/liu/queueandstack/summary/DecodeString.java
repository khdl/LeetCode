package com.liu.queueandstack.summary;

import java.util.Stack;

/**
 * @ClassName: DecodeString
 * @Auther: yu
 * @Date: 2018/11/8 21:37
 * @Description: 字符串解码
 * 给定一个经过编码的字符串，返回它解码后的字符串。
 */
public class DecodeString {

    public static void main(String[] args){
       String s = "23[abc]3[cd]ef";
       String res = decodeString(s);
       System.out.println(res);
    }
    public static  String decodeString(String s) {
        String res = "";
        // 记录'['之前的数字
        Stack<Integer> countStack = new Stack<>();
        // 记录'['之前的运算结果
        Stack<String> resStack = new Stack<>();
        int idx = 0;
        int curNum = 0;
        while (idx < s.length()) {
            char ch = s.charAt(idx);
            if (Character.isDigit(ch)) {
                while (Character.isDigit(s.charAt(idx))){
                    curNum = 10 * curNum + (s.charAt(idx++) - '0');
                }
            } else if (ch == '[') {
                resStack.push(res);
                res = "";
                countStack.push(curNum);
                curNum = 0;
                idx++;
            } else if (ch == ']') {
                StringBuilder temp =
                        new StringBuilder(resStack.pop());

                int repeatTimes = countStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(res);
                }
                res = temp.toString();
                idx++;
                // 字母
            } else {
                res += s.charAt(idx++);
            }
        }
        return res;

    }
}
