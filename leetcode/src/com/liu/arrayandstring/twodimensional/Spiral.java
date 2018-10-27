package com.liu.arrayandstring.twodimensional;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Spiral
 * @Auther: yu
 * @Date: 2018/10/26 21:40
 * @Description: 螺旋矩阵
 * 给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
 */
public class Spiral {
    public static void main(String[] args){
        int[][] a =new int[3][];
        a[0] = new int[]{1,2,3};
        a[1] = new int[]{4,5,6};
        a[2] = new int[]{7,8,9};
        List<Integer> n = spiralOrder(a);
        System.out.println(n);
    }
    public static  List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if(matrix.length == 0 || matrix[0].length == 0){
            return  res;
        }
        // 只有一行的情况
        if (matrix.length == 1) {
            for (int i : matrix[0]) {
                res.add(i);
            }

            return res;
        }

        // 只有一列的情况
        if (matrix[0].length == 1) {
            for (int i = 0; i < matrix.length; i++) {
                res.add(matrix[i][0]);
            }

            return res;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        //环的个数
        int  c = m >n ? (n+1)/2 : (m+1)/2;

        int round =0;
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int down = matrix.length - 1;
        int count = 0;
        int total = m * n;

        while (round < c){
            //上边一列
            for (int i = left; i <= right && count < total; i++) {
                 count++;
                 res.add(matrix[round][i]);
            }
            top++; //

            // 右边一列
            for (int i = top; i <= down && count < total; i++) {
                count++;
                res.add(matrix[i][n - round - 1]);
            }
            right--;

            // 底下一行
            for (int i = right; i >= left && count < total; i--) {
                count++;
                res.add(matrix[m - round - 1][i]);

            }
            down--;

            // 左边一列
            for (int i = down; i >= top && count < total; i--) {
                count++;
                res.add(matrix[i][round]);
            }
            left++;

            round++;
        }
        return  res;
    }
}
