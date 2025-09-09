package UserInfo;

import java.util.Scanner;

public class UserInfo {

    // Method to check if the person is an adult
    public static boolean isAdult(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Call method
        boolean adult = isAdult(age);

        // Display result
        System.out.println("\nHello, " + name + "!");
        if (adult) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult yet.");
        }

        scanner.close();
    }
}
