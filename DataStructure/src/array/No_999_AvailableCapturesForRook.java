package array;

public class No_999_AvailableCapturesForRook {
    public static void main(String[] args) {
        char[][] arr = {{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','R','.','.','.','p'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
//        char[][] arr = {{'.','.','.','.','.','.','.','.'},{'.','p','p','p','p','p','.','.'},{'.','p','p','B','p','p','.','.'},{'.','p','B','R','B','p','.','.'},{'.','p','p','B','p','p','.','.'},{'.','p','p','p','p','p','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
//        char[][] arr = {{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','p','p','.','.','.','.'},{'.','p','p','R','.','p','.','p'},{'.','.','.','p','.','.','.','.'},{'.','.','.','.','.','p','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
        int result = numRookCaptures(arr);
        System.out.println("result = " + result);
    }

    public static int numRookCaptures(char[][] board) {
        int x = 0, y = 0;
        for (x = 0; x < board.length - 1; x++){
            for (y = 0; y < board.length - 1; y++)
                if(board[y][x] == 'R')
                    break;
            if(board[y][x] == 'R')
                break;
        }

        int result = 0;
        for (int i = x + 1; i < board.length && board[y][i] != 'B'; i++)
            if(board[y][i] == 'p'){
                result++;
                break;
            }

        for (int i = x - 1; i >= 0 && board[y][i] != 'B'; i--)
            if(board[y][i] == 'p'){
                result++;
                break;
            }

        for (int i = y + 1; i < board.length && board[i][x] != 'B'; i++)
            if(board[i][x] == 'p'){
                result++;
                break;
            }

        for (int i = y - 1; i >= 0 && board[i][x] != 'B'; i--)
            if(board[i][x] == 'p'){
                result++;
                break;
            }

        return result;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：36.4 MB, 在所有 Java 提交中击败了50.00%的用户
         */
    }
}
