import java.util.Scanner;

public class TicTacToe {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int slot = getUserSlot();   // take input

        int row = getRowFromSlot(slot);
        int col = getColFromSlot(slot);

        System.out.println("You selected slot: " + slot);
        System.out.println("Row: " + row);
        System.out.println("Column: " + col);
    }

    // UC3 reused: take input (1–9)
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

    // UC4: Convert slot → row
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    // UC4: Convert slot → column
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
}