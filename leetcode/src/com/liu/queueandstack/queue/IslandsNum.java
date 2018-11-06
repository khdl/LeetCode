package com.liu.queueandstack.queue;

/**
 * @ClassName: IslandsNum
 * @Auther: yu
 * @Date: 2018/11/5 23:21
 * @Description:  岛屿的个数
 */
public class IslandsNum {
    public static void main(String[] args){
       char[][] grid = new char[4][5];
       grid[0] =new char[]{'1','1','1','1','0'};
       numIslands(grid);
    }
    public static  int numIslands(char[][] grid) {
        int res = 0;
        if(grid == null || grid.length == 0 || grid[0].length == 0 ){
            return  res;
        }
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                if(grid[i][j] == '1'){
                   res++;
                   combine(grid,i,j);
                }

            }

        }
        return res;
    }

    private static void combine(char[][] grid, int i, int j) {
        grid[i][j]='0';
        if( i > grid.length-1 && j> grid[0].length -1){
            return;
        }
        if(i < grid.length - 1 && grid[i+1][j] == '1'){
            combine(grid,i+1,j);
        }
        if (j < grid[0].length - 1 && grid[i][j+1] == '1'){
            combine(grid,i,j+1);
        }
        if(i > 0 && grid[i-1][j] == '1'){
            combine(grid,i-1,j);
        }
        if(j > 0 && grid[i][j -1] == '1'){
            combine(grid,i,j-1);
        }
    }
}
