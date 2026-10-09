package m1.l20.menu;

import java.util.Scanner;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    static void main() {
        System.out.println("Hi, player! Welcome to the game!");
        do {
            showMenu();
            int choice = getUserChoice();
            handleChoice(choice);
        } while (true);
    }

   /* private static void showMenu() {
        System.out.println("Please choose an option:");
        System.out.println("1. Start Game");
        System.out.println("2. Load Game");
        System.out.println("3. Settings");
        System.out.println("4. Exit");
    }*/

    private static void showMenu() {
        System.out.println("Please choose an option:");

        final MenuItem[] values = MenuItem.values();
        values[0].setAdditional("Start a new game");

        for (int i = 0; i < values.length; i++) {
            MenuItem value = values[i];
            System.out.println((i + 1) + ". " + value);
        }
    }

    private static int getUserChoice() {
        return SCANNER.nextInt();
    }

    private static void handleChoice(final int choice) {
        final MenuItem[] values = MenuItem.values();
        int userChoice = choice - 1; // Adjust for zero-based index
        values[userChoice].executeAction();

        /*if (choice == 1) {
            System.out.println("Starting a new game...");
            // Add logic to start a new game
        } else if (choice == 2) {
            System.out.println("Loading a saved game...");
            // Add logic to load a saved game
        } else if (choice == 3) {
            System.out.println("Opening settings...");
            // Add logic to open settings
        } else if (choice == 4) {
            System.out.println("Exiting the game. Goodbye!");
            System.exit(0);
        } else {
            System.out.println("Invalid choice. Please try again.");
        }*/
    }
}
