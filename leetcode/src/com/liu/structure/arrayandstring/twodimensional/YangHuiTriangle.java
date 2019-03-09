package com.liu.structure.arrayandstring.twodimensional;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: YangHuiTriangle
 * @Auther: yu
 * @Date: 2018/10/27 15:39
 * @Description:杨辉三角
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行
 */
public class YangHuiTriangle {
    public static void main(String[] args){
        int num = 5;
        List<List<Integer>> result =  generate(num);
        System.out.println(result);
    }

    /**
     * 杨辉三角的特点是triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j]
     * @param numRows
     * @return
     */
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res  = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            //第一个为1
            list.add(1);
            for(int j = 1;j < i;j++){
                list.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
            }
            if (i>0){
                list.add(1);
            }
            res.add(list);
        }
        return  res;
    }
}
