package com.liu.binarysearch;

import java.util.Random;

/**
 * @ClassName: GuessNumber
 * @Auther: yu
 * @Date: 2019/1/2 19:56
 * @Description: 猜数字大小
 */
public class GuessNumber {
    public int guessNumber(int n) {
        int lo = 1, hi = n;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int result=guess(mid);
            if(result==1){
                lo=mid+1;
            }
            else if(result==-1){
                hi=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
        
    }

    /**
     * 返回int值得方法，为了方便写的，与实际无关
     * @param mid
     * @return
     */
    private int guess(int mid) {
        int n = new Random().nextInt();
        if(mid > n ){
            return  1;
        }else  if(mid < n){
            return  -1;
        }else {
            return 0;
        }
    }
}
