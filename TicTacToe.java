public class TicTacToe {

    // Board with empty cells '-'
    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {

        // Test cases
        System.out.println(isValidMove(1, 1)); // true
        board[1][1] = 'X';                    // fill cell
        System.out.println(isValidMove(1, 1)); // false
        System.out.println(isValidMove(3, 0)); // false (out of bounds)
    }

    // UC5: Validate move
    static boolean isValidMove(int row, int col) {

        // Check boundaries (0–2)
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
}