class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!check(i, j, board[i][j], board)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean check(int i, int j, char val, char[][] board) {
        for (int k = 0; k < 9; k++) {
            if (board[k][j] == val && k != i) {
                return false;
            }
            if (board[i][k] == val && k != j) {
                return false;
            }
        }

        if (i < 3 && j < 3) {
            for (int m = 0; m < 3; m++) {
                for (int n = 0; n < 3; n++) {
                    if (board[m][n] == val && (m != i || n != j)) {
                        return false;
                    }
                }
            }
        } else if (i < 3 && j < 6) {
            for (int m = 0; m < 3; m++) {
                for (int n = 3; n < 6; n++) {
                    if (board[m][n] == val && (m != i || n != j)) {
                        return false;
                    }
                }
            }
        } else if (i < 3 && j < 9) {
            for (int m = 0; m < 3; m++) {
                for (int n = 6; n < 9; n++) {
                    if (board[m][n] == val && (m != i || n != j)) {
                        return false;
                    }
                }
            }
        } else if (i < 6 && j < 3) {
            for (int m = 3; m < 6; m++) {
                for (int n = 0; n < 3; n++) {
                    if (board[m][n] == val && (m != i || n != j)) {
                        return false;
                    }
                }
            }
        } else if (i < 6 && j < 6) {
            for (int m = 3; m < 6; m++) {
                for (int n = 3; n < 6; n++) {
                    if (board[m][n] == val && (m != i || n != j)) {
                        return false;
                    }
                }
            }
        } else if (i < 6 && j < 9) {
            for (int m = 3; m < 6; m++) {
                for (int n = 6; n < 9; n++) {
                    if (board[m][n] == val && (m != i || n != j)) {
                        return false;
                    }
                }
            }
        } else if (i < 9 && j < 3) {
            for (int m = 6; m < 9; m++) {
                for (int n = 0; n < 3; n++) {
                    if (board[m][n] == val && (m != i || n != j)) {
                        return false;
                    }
                }
            }
        } else if (i < 9 && j < 6) {
            for (int m = 6; m < 9; m++) {
                for (int n = 3; n < 6; n++) {
                    if (board[m][n] == val && (m != i || n != j)) {
                        return false;
                    }
                }
            }
        } else if (i < 9 && j < 9) {
            for (int m = 6; m < 9; m++) {
                for (int n = 6; n < 9; n++) {
                    if (board[m][n] == val && (m != i || n != j)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
