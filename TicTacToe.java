import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();

        int userSlot = getUserSlot();   
        System.out.println("You selected slot: " + userSlot);
    }

    // UC2: Toss and assign symbols
    static void tossAndAssignSymbols() {
        Random rand = new Random();
        int toss = rand.nextInt(2);

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

    // UC2: Display result
    static void displayTossResult() {
        if (isHumanTurn) {
            System.out.println("Human starts first.");
        } else {
            System.out.println("Computer starts first.");
        }

        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }

    // UC3: Accept user slot input (1–9)
    static int getUserSlot() {
        int slot;

        while (true) {
            System.out.print("Enter a slot (1-9): ");
            slot = sc.nextInt();

            if (slot >= 1 && slot <= 9) {
                return slot;
            } else {
                System.out.println("Invalid input! Enter number between 1 and 9.");
            }
        }
    }
}