package Intro;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first num: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second num: ");
        int num2 = scanner.nextInt();

        // Consume leftover newline
        scanner.nextLine();

        System.out.print("Enter add or sub or divide: ");
        String operation = scanner.nextLine();

        Calc calc = new Calc();

        if (operation.equalsIgnoreCase("add")) {
            int result = calc.add(num1, num2);
            System.out.println("The results of addition " +result);

        } else if(operation.equalsIgnoreCase("sub")) {
            int result = calc.subtract(num1, num2);
            System.out.println("The results of subtraction " +result);

        } else if(operation.equalsIgnoreCase("divide")) {
            double result = calc.divide(num1,num2);
            System.out.println("The results of divide " +result);

        } else{
            System.out.println("Invalid operation");
        }

    }

    public int add(int num1,int num2){
        return num1 + num2;
    }


    public int subtract(int num1, int num2){
        return num1 - num2;
    }

    public int multiply(int num1, int num2){
        return num1 * num2;
    }

    public double divide(int num1, int num2){
        if(num2 == 0){
            System.out.println("Cannot divide by zero");
        }
        return (double) num1 / num2;
    }




}
