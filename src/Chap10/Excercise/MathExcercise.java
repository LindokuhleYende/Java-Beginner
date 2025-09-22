package Chap10.Excercise;

public class MathExcercise {
    // Static methods - called on the class name
    double result = Math.sqrt(25);        // Returns 5.0
    double power = Math.pow(2, 3);        // Returns 8.0
    int maximum = Math.max(10, 20);       // Returns 20
    double random = Math.random();        // Random number between 0.0 and 1.0

    // Static constant
//    double circleArea = Math.PI * radius * radius;


    public static void main(String[] args) {
        MathExcercise math = new MathExcercise();
        System.out.println(Math.round(Math.pow(2, 3)));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.max(10,20));

    }
}
