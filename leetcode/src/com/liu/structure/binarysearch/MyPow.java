package com.liu.structure.binarysearch;

/**
 * @ClassName: MyPow
 * @Auther: yu
 * @Date: 2019/1/10 18:17
 * @Description: 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
 */
public class MyPow {
    public double myPow(double x, int n) {
        double temp=x;
        if(n==0){
            return 1;
        }
        temp=myPow(x,n/2);
        if(n%2==0){
            return temp*temp;
        }
        else {
            if(n > 0){
                return x*temp*temp;
            }
            else{
                return (temp*temp)/x;
            }
        }
    }
}
