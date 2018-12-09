package com.liu.hash;

/**
 * @ClassName: IsValidSudoke
 * @Auther: yu
 * @Date: 2018/12/9 20:08
 * @Description: 有效的数独
 * 判断一个 9x9 的数独是否有效
 */
public class IsValidSudoke {
    public static void main(String[] args){
        char[][] a = {{'.', '8', '7', '6', '5', '4', '3', '2', '1'}, {'2', '.', '.', '.', '.', '.', '.', '.', '.'}, {'3', '.', '.', '.', '.', '.', '.', '.', '.'}, {'4', '.', '.', '.', '.', '.', '.', '.', '.'}, {'5', '.', '.', '.', '.', '.', '.', '.', '.'}, {'6', '.', '.', '.', '.', '.', '.', '.', '.'}, {'7', '.', '.', '.', '.', '.', '.', '.', '.'}, {'8', '.', '.', '.', '.', '.', '.', '.', '.'}, {'9', '.', '.', '.', '.', '.', '.', '.', '.'}};
        new IsValidSudoke().isValidSudoku(a);
    }
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rowFlag = new boolean[9][9];
        boolean[][] colFlag = new boolean[9][9];
        boolean[][] cellFlag = new boolean[9][9];
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                if (board[i][j] >= '1' && board[i][j] <= '9') {
                    int c = board[i][j] - '1';
                    if (rowFlag[i][c] || colFlag[c][j] || cellFlag[3 * (i / 3) + j / 3][c]) {
                        return false;
                    }
                    rowFlag[i][c] = true;
                    colFlag[c][j] = true;
                    cellFlag[3 * (i / 3) + j / 3][c] = true;
                }
            }
        }

        return  true;
    }
}
