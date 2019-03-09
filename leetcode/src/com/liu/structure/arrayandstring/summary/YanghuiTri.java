package com.liu.structure.arrayandstring.summary;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: YanghuiTri
 * @Auther: yu
 * @Date: 2018/10/31 18:38
 * @Description: 杨辉三角 II
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * 杨辉三角的特点是triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j]
 */
public class YanghuiTri {
    public static void main(String[] args){
        int k = 5;
        getRow(k);
    }
    public static  List<Integer> getRow(int rowIndex) {
        if(rowIndex == 0){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            return list;
        }
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> list = new ArrayList<>();
            //第一个为1
            list.add(1);
            for (int j = 1; j < i; j++) {
                list.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            if (i > 0) {
                list.add(1);
            }
            res.add(list);
        }
        return res.get(res.size()-1);

    }

}
