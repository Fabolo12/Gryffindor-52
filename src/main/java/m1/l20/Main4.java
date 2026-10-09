package m1.l20;

import java.time.LocalDate;
import java.util.Random;

public class Main4 {
    static void main() {
        int choice = 1; // Example choice value
        String name = "admin";

    }

    private static void method0(int choice) {
        if (choice == 1) { // Check if it's Monday
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
        }
    }

    private static void method1(int choice) {
        switch (choice) {
            case 5:
            case 6:
            case 1:
                System.out.println("Starting a new game...");
                final Random random = new Random();
                final int i = random.nextInt(100);
                if (i > 50) {
                    System.out.println("You are lucky today! You get a bonus item!");
                }
                break;
            case 2:
                System.out.println("Loading a saved game...");
                break;
            case 3:
                System.out.println("Opening settings...");
                break;
            case 4:
                System.out.println("Exiting the game. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void method2(int choice) {

        switch (choice) {
            case 1, 5, 6 -> {
                System.out.println("Starting a new game...");
                final Random random = new Random();
                final int i = random.nextInt(100);
                if (i > 50) {
                    System.out.println("You are lucky today! You get a bonus item!");
                }
            }
            case 2 -> System.out.println("Loading a saved game...");
            case 3 -> System.out.println("Opening settings...");
            case 4 -> {
                System.out.println("Exiting the game. Goodbye!");
                System.exit(0);
            }
            default -> System.out.println("Invalid choice. Please try again.");
        }
    }

    private static int method3(int choice) {
        return switch (choice) {
            case 1, 5, 6 -> {
                System.out.println("Starting a new game...");
                yield 1 * 10;
            }
            case 2 -> 2 * 10;
            case 3 -> 3 * 10;
            case 4 -> 4 * 10;
            default -> -1;
        };
    }
}
