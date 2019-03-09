package com.liu.structure.queueandstack.summary;

/**
 * @ClassName: Updatematrix
 * @Auther: yu
 * @Date: 2018/11/11 11:17
 * @Description: 矩阵
 * 给定一个由 0 和 1 组成的矩阵，找出每个元素到最近的 0 的距离。
 */
public class UpdateMatrix {
    public static void main(String[] args){
        UpdateMatrix um = new UpdateMatrix();
        int[][] matrix =  {{0,0,0},{0,1,0},{1,1,1}};
        int[][] res = um.updateMatrix(matrix);
        System.out.println(res);

    }
    public int[][] updateMatrix(int[][] matrix) {
         int cout = 0;
         int all = matrix.length * matrix[0].length;
         int initnum = 0;
         while(cout <all){
             cout = 0;
             for (int i = 0; i <matrix.length ; i++) {
                 for (int j = 0; j <matrix[0].length ; j++) {
                     if(matrix[i][j] <= initnum){
                         cout++;
                     }else{
                         // 判断周围的数有没有目标值
                         boolean flag  = isTarget(matrix,i,j,initnum);
                         if(flag){
                             cout++;
                         }else{
                             matrix[i][j] +=1;
                         }
                     }
                 }
             }
             initnum++;
         }
         return  matrix;
    }

    private boolean isTarget(int[][] matrix, int i, int j,int initnum) {
        if(i+1 < matrix.length && matrix[i+1][j] == initnum){
            return  true;
        }
        if(j+1 < matrix[0].length && matrix[i][j+1] == initnum){
            return  true;
        }if(i-1 >= 0 && matrix[i-1][j] == initnum){
            return  true;
        }if(j-1 >= 0 && matrix[i][j-1] == initnum){
            return  true;
        }
        return  false;
    }
}
