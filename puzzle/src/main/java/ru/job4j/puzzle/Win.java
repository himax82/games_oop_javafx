package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            boolean ch = false;
            for (int j = 0; j < board.length - 1; j++) {
                if (board[i][j] == 1 && board[i][j] == board[i][j + 1]) {
                    ch = true;
                } else {
                    ch = false;
                    break;
                }
            }
            if (ch) {
                return true;
            }
        }
        for (int i = 0; i < board.length; i++) {
            boolean ch = false;
            for (int j = 0; j < board.length - 1; j++) {
                if (board[j][i] == 1 && board[j][i] == board[j + 1][i]) {
                    ch = true;
                } else {
                    ch = false;
                    break;
                }
            }
            if (ch) {
                return true;
            }
        }
        return false;
    }
}
