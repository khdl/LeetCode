package com.liu.structure.arrayandstring.twodimensional;

/**
 * @ClassName: Diagonal
 * @Auther: yu
 * @Date: 2018/10/25 23:10
 * @Description: 对角线遍历
 */
public class Diagonal {
    
    public static void main(String[] args){
       int[][] a =new int[3][];
       a[0] = new int[]{1,2,3};
       a[1] = new int[]{4,5,6};
       a[2] = new int[]{7,8,9};
       int[] n = findDiagonalOrder(a);
       System.out.println(n);
    }

    public static int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0){
            return  new int[0];
        }
         int m = matrix.length;
         int n = matrix[0].length;
         int[] res = new int[m*n];
         int r = 0;
         int c = 0;
         int k = 0;
        //存储方向改变值，右上，或者左下
        int[][] dirs = {{-1, 1},
                {1, -1}};
        
        for (int i = 0; i < res.length; ++i) {
            res[i] = matrix[r][c];
            r += dirs[k][0];
            c += dirs[k][1];
            if (r >= m) {
            	r = m - 1; c += 2; k = 1 - k;
            }
            if (c >= n) {
            	c = n - 1; r += 2; k = 1 - k;
            }
            if (r < 0) {
            	r = 0; k = 1 - k;
            }
            if (c < 0) {
            	c = 0; k = 1 - k;
            }
        }
        return res;
    }
}
