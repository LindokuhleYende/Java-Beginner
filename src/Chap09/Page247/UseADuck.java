package Chap09.Page247;

class Duck {
    int size;

    // Constructor with no arguments sets a default size
    public Duck() {
        size = 10;  // default size
        System.out.println("Quack Quack Quack Quack!!!");
        System.out.println("size is " + size);
    }

    // Constructor with size parameter sets the size to the given value
    public Duck(int duckSize) {
        size = duckSize;
        System.out.println("Quack Quack");
        System.out.println("size is " + size);
    }
}

public class UseADuck {
    public static void main(String[] args) {
        Duck defaultDuck = new Duck();      // Uses default size
        Duck customDuck = new Duck(42);     // Uses specified size
    }
}
