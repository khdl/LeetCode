package com.liu.arrayandstring.string;

/**
 * @ClassName: BinarySum
 * @Auther: yu
 * @Date: 2018/10/27 20:05
 * @Description:二进制求和
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 * 输入为非空字符串且只包含数字 1 和 0。
 */
public class BinarySum {
    public static void main(String[] args){
       String a ="1010";
       String b ="1011";
       String res = addBinary(a,b);
       System.out.println(res);

    }
    public static  String addBinary(String a, String b) {
        String  res ="";
        char[] array1= a.toCharArray();
        char[] array2= b.toCharArray();
        int m = array1.length -1;
        int n = array2.length -1;
        int carry = 0;
        while(m>=0 || n>=0){
            int p = m>=0 ?  Integer.parseInt(String.valueOf(array1[m--])) : 0;
            int q = n>=0 ?  Integer.parseInt(String.valueOf(array2[n--])) : 0;
            int sum = p + q + carry;
            res =String.valueOf(sum % 2) + res;
            carry = sum/2;
        }
        return carry == 1 ? "1"+ res : res;
    }
}
