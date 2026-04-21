public class TicTacToe {

    static char[][] board = new char[3][3];

    // Entry point
    public static void main(String[] args) {
        placeMove(0, 0, 'X');
        System.out.println(board[0][0]);
    }

    // Places a symbol on the board
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }
}