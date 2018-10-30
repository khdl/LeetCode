package com.liu.arrayandstring.array;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Arrays;

/**
 * @ClassName: AddOne
 * @Auther: yu
 * @Date: 2018/10/24 23:30
 * @Description:加一
 */
public class AddOne {
    public static void main(String[] args){
        int[] digits ={0};
        int res[] = plusOne(digits);
        System.out.println(res[0]);;
    }

    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i] = digits[i]+1;
                return digits;
            }
            digits[i]=0;
        }
        int[] res = new int[digits.length+1];
        res[0] = 1;
        return  res;
    }
}
