package com.liu.arrayandstring.twodimensional;

/**
 * @ClassName: Diagonal
 * @Auther: yu
 * @Date: 2018/10/25 23:10
 * @Description: 对角线遍历
 */
public class Diagonal {
    
    public static void main(String[] args){
       int[][] a =new int[1][];
     a[0] = new int[]{2,3};
       /*  a[1] = new int[]{4,5,6};
       a[2] = new int[]{7,8,9};*/
       int[] n = findDiagonalOrder(a);
        System.out.println(n);
    }

    public static int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0){
            return  new int[0];
        }
         int[] res = new int[matrix.length*matrix[0].length];
         int row = 0;
         int col = 0;
        //存储方向改变值，右上，或者左下
        int[][] dirs = {{-1, 1},
                {1, -1}};
        int k = 0;
        for (int i = 0; i < res.length; i++) {
            //将当前坐标赋值给新数组
            res[i] = matrix[row][col];
            //计算下一个点的坐标
            row += dirs[k][0];
            col += dirs[k][1];
            //根据边界条件，修正下一个点的坐标值.触碰边界，必然对方向取反
            //右上方向碰到边界
            if (col > matrix.length - 1) {
                col = matrix[0].length - 1;
                row += 2;
                //方向取反
                k = 1 - k;
            }
            if (row < 0) {
                row = 0;
                k = 1 - k;
            }
            //左下方向碰到边界
            if (row >  matrix.length - 1) {
                row =  matrix.length - 1;
                col += 2;
                k = 1 - k;
            }
            if (col < 0) {
                col = 0;
                k = 1 - k;
            }
        }

        return res;
    }
}
