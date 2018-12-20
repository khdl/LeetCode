package com.liu.hash;

/**
 * @ClassName: NumJewelsInStones
 * @Auther: yu
 * @Date: 2018/12/20 20:31
 * @Description: 宝石与石头
 * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，
 * 你想知道你拥有的石头中有多少是宝石。
 */
public class NumJewelsInStones {
    public int numJewelsInStones(String J, String S) {
        int res = 0;
        char[] s = S.toCharArray();
        char[] j = J.toCharArray();
        for (int i = 0; i <s.length ; i++) {
            for (int k = 0; k <j.length ; k++) {
                if(s[i] == j[k]){
                    res++;
                }
            }
        }
        return  res;
    }
}
