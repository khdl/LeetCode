package com.liu.queueandstack.queue;

/**
 * @ClassName: SquaresNum
 * @Auther: yu
 * @Date: 2018/11/6 12:53
 * @Description: 完全平方数
 * 给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
 * 四平方定理： 任何一个正整数都可以表示成不超过四个整数的平方之和。
 */
public class SquaresNum {
    public static void main(String[] args){
        int a= 16;
        int res =numSquares(a);
        System.out.println(res);
    }
    public static int numSquares(int n) {
     while(n%4 == 0){
        n=n/4;
     }
     if(n%8 == 7){
         return 4;
     }
     for(int a=0;a*a<=n;a++){
         int b = (int) Math.sqrt(n - a*a);
         if(a*a + b*b == n){
             if(a > 0 && b >0){
                 return  2;
             }else{
                 return 1;
             }
         }
     }
     return  3;
    }
}
