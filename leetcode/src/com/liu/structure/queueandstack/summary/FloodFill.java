package com.liu.structure.queueandstack.summary;

/**
 * @ClassName: FloodFill
 * @Auther: yu
 * @Date: 2018/11/10 22:41
 * @Description:图像渲染
 * 深度优先算法，递归调用
 */
public class FloodFill {
    public static void main(String[] args){
        int[][] image =  {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int newColor = 2;
        FloodFill floodFill = new FloodFill();
        int[][] res = floodFill.floodFill(image,sr,sc,newColor);
        System.out.println(res);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        int[][] visited = new int[image.length][image[0].length];
        dfs(image,oldColor,newColor,sr,sc,visited);
        return image;
    }

    private void dfs(int[][] image, int oldColor, int newColor, int x, int y, int[][] visited) {
        if(image[x][y] == oldColor){
             image[x][y] = newColor;
             visited[x][y] = 1;
             if(x+1 < image.length && visited[x+1][y] == 0){
                 dfs(image,oldColor,newColor,x+1,y,visited);
             }
            if(y+1 < image[0].length && visited[x][y+1] == 0){
                dfs(image,oldColor,newColor,x,y+1,visited);
            }
            if(x-1 >= 0 && visited[x-1][y] == 0){
                dfs(image,oldColor,newColor,x-1,y,visited);
            }
            if(y-1 >= 0 && visited[x][y-1] == 0){
                dfs(image,oldColor,newColor,x,y-1,visited);
            }
        }else {
            return;
        }
    }
}
