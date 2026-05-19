public class N_Knights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knight(board, 0, 0, 4);

    }

    private static void knight(boolean[][] board, int row, int col, int knight) {
        if (knight == 0) {
            display(board);
            System.out.println();
            return;
        }

        if (row == board.length - 1 && col == board.length) {
            return;
        }

        if (col == board.length) {
            knight(board, row + 1, 0, knight);
            return;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            knight(board, row, col + 1, knight - 1);
            board[row][col] = false;
        }

        knight(board, row, col + 1, knight);

    }

    private static void display(boolean[][] board) {
        for (int r = 0; r < board.length; r++) { // for row itration
            for (int c = 0; c < board.length; c++) { // for col itration because borads should be of size n*n so end for
                                                     // row and col should be board.length-1 ;
                if (board[r][c] == true) {
                    System.out.print("K ");
                } else {
                    System.out.print(". ");

                }
            }
            System.out.println();
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }

        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }

        return true;
    }

    private static boolean isValid(boolean[][] board, int r, int c) {
        if (r >= 0 && r < board.length && c >= 0 && c < board.length) {
            return true;
        }
        return false;
    }

}
