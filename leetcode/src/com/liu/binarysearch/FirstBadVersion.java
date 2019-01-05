package com.liu.binarysearch;

/**
 * @ClassName: FirstBadVersion
 * @Auther: yu
 * @Date: 2019/1/5 22:41
 * @Description: 第一个错误的版本
 */
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int min = 1, max = n, mid = 0;
        while(min <= max){
            mid = min + (max - min) / 2;
            if(isBadVersion(mid)){
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }

    /**
     *  一个返回boolean值得接口，为方便返回false
     * @param mid
     * @return
     */
    private boolean isBadVersion(int mid) {
        return  false;
    }
}
