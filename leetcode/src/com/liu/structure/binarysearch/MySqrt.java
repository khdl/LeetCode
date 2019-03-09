package com.liu.structure.binarysearch;

/**
 * @ClassName: MySqrt
 * @Auther: yu
 * @Date: 2019/1/1 20:08
 * @Description: x 的平方根
 * 实现 int sqrt(int x) 函数。计算并返回 x 的平方根，其中 x 是非负整数。小数部分将被舍去。
 */
public class MySqrt {
    public static void main(String[] args){
       new MySqrt().mySqrt(1);
    }
    public int mySqrt(int x) {
        for (long i = 0; i <= x; i++) {
            if(i * i > x){
                return  (int)i -1;
            }
            if(i * i == x){
                return  (int)i;
            }
        }
        return  0;
    }
}
