import java.util.Random;

public class TicTacToe {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    // Entry point
    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    // Toss to decide who starts and assign symbols
    static void tossAndAssignSymbols() {
        Random rand = new Random();
        int toss = rand.nextInt(2); // 0 or 1

        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    // Display result of toss
    static void displayTossResult() {
        if (isHumanTurn) {
            System.out.println("You won the toss!");
            System.out.println("You play first with symbol: " + humanSymbol);
            System.out.println("Computer gets: " + computerSymbol);
        } else {
            System.out.println("Computer won the toss!");
            System.out.println("Computer plays first with symbol: " + computerSymbol);
            System.out.println("You get: " + humanSymbol);
        }
    }
}

            
    

