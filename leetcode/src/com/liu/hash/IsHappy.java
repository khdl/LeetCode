package com.liu.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: IsHappy
 * @Auther: yu
 * @Date: 2018/12/4 20:26
 * @Description:快乐数
 * “快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1,
 * 也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
 */
public class IsHappy {
    public boolean isHappy(int n) {
        if (n ==1){
            return true;
        }
        Set<Integer> set = new HashSet<>();
        set.add(n);
        boolean res = false;
        while (true){
            int sum = 0;
            while (n >0){
                int tep = n % 10;
                sum += tep*tep;
                n = n/10; 
            }
            if(sum == 1){
                res = true;
                break;
            }
            n = sum;
            if(set.contains(n)){
                return  false;
            }
            set.add(n);
        }
        return  res;
    }
}
