package Chap09.Page252;

class Duck {
    int size;
    boolean canFly;

    // No-argument constructor
    public Duck() {
        this.size = 5;
        this.canFly = true;
        System.out.println("Default Duck created.");
    }

    // Constructor with size parameter
    public Duck(int size) {
        this.size = size;
        this.canFly = true;
        System.out.println("Duck created with size: " + size);
    }

    // Constructor with size and canFly parameters
    public Duck(int size, boolean canFly) {
        this.size = size;
        this.canFly = canFly;
        System.out.println("Duck created with size: " + size + " and canFly: " + canFly);
    }
}

public class UseADuck {
    public static void main(String[] args) {
        Duck d1 = new Duck();                           // Calls no-argument constructor
        Duck d2 = new Duck(10);                    // Calls constructor with size parameter
        Duck d3 = new Duck(15, false);      // Calls constructor with size and canFly parameters
    }
}

