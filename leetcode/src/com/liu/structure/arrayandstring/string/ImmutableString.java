package com.liu.structure.arrayandstring.string;

/**
 * @ClassName: ImmutableString
 * @Auther: yu
 * @Date: 2018/10/27 19:59
 * @Description:不可变字符串
 * 替代方案，char数组，StringBuilder，StringBuffer
 */
public class ImmutableString {
    public static void main(String[] args){
       String s = "hello world";
       char[] str = s.toCharArray();
       str[5] = ',';
       System.out.println(str);

        int n = 10000;
        StringBuilder str1= new StringBuilder();
        for (int i = 0; i < n; i++) {
            str1.append("hello");
        }
        String s2 = str1.toString();
    }
}
