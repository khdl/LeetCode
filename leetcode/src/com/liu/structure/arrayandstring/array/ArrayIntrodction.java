package com.liu.structure.arrayandstring.array;

import java.util.Arrays;

/**
 * @ClassName: ArrayIntrodction
 * @Auther: yu
 * @Date: 2018/10/23 21:31
 * @Description:数组简介
 */
public class ArrayIntrodction {

    public static void main(String[] args){
        int[] a0 = new int[5];
        int[] a1 = {1,2,3};
        System.out.println("The sise of a1 is" + a1.length);
        System.out.println("The first slement is" + a1[0]);
        for(int i=0;i<a0.length;i++){
            System.out.println(a0[i]);
        }
        for (int item : a1) {
            System.out.println(item);
        }
        a1[0] =4;
        Arrays.sort(a1);
        for (int item : a1) {
            System.out.println(item);
        }
    }
}
