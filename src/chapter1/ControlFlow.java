package chapter1;

public class ControlFlow {
    public static void main(String[] args) {
        // -----------------------------
        // 1. Do something (Statements)
        // -----------------------------

        System.out.println("-----1. Do something (Statements)-----");
        // Declare and assign an integer variable
        int x = 3;

        // Declare and assign a String variable
        String name = "Dirk";

        // Multiply x by 17 and update its value
        x = x * 17;

        // Print the current value of x
        System.out.println("x is " + x);

        // Generate a random double value between 0.0 and 1.0
        double d = Math.random();  // Note: We're not using this value, just testing

        // -----------------------------
        // 2. Do something again and again (Loops)
        // -----------------------------

        System.out.println("-----2.Do something again and again (Loops)-----");
        // WHILE loop: run as long as x is greater than 12
        // This loop will not print any output because there is no print statement inside it
        while (x > 12) {
            x = x - 1; // decrease x by 1 each time
        }

        // FOR loop: repeat 10 times, from i = 0 to i < 10
        for (int i = 0; i < 10; i = i + 1) {
            System.out.println("i is now " + i);
        }

        // -----------------------------
        // 3. Do something under a condition (if/else)
        // -----------------------------

        System.out.println("-----3. Do something under a condition (if/else)-----");
        // IF/ELSE statement: check if x equals 10
        if (x == 10) {
            System.out.println("x must be 10");
        } else {
            System.out.println("x isn't 10");
        }

        // IF statement with two conditions:
        // 1. x is less than 3 AND 2. name is equal to "Dirk"
        if ((x < 3) && (name.equals("Dirk"))) {
            System.out.println("Gently");
        }

        // This line will always run no matter what the conditions above were
        System.out.println("This line runs no matter what");


    }
}
