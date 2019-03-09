package com.liu.structure.arrayandstring.doublepointer;

/**
 * @ClassName: ReverseString
 * @Auther: yu
 * @Date: 2018/10/29 19:41
 * @Description: 字符串反转
 * 编写一个函数，其作用是将输入的字符串反转过来。
 */
public class ReverseString {
	public static void main(String[] args) {
		String s = "hello";
		String res = reverseString(s);
		System.out.println(res);
	}
   public static String reverseString(String s) {
        String res ="";
        char[] m = s.toCharArray();
        int i=0;
        int j=s.length() -1;
        while(i < j){
        	char tmp = m[i];
        	m[i] = m[j];
        	m[j] = tmp;
        	i++;
        	j--;
        }
        res =String.valueOf(m);
        return res;
    }
}
