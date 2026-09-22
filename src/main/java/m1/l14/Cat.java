package m1.l14;

import java.util.Scanner;

public class Cat {
    {                                                       // 4
        System.out.println("Instance initializer Cat");
    }

    static {                                                // 2
        System.out.println("Static initializer Cat");
    }

    private static int a;                                   // 1
    private int b;                                          // 3


    public Cat() {                                          // 5
        System.out.println("Constructor Cat");
    }

    public void method() {                                  // 6
        System.out.println("Method Cat");

        final Scanner scanner = new Scanner(System.in);
    }
}
