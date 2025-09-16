package Chap09.Page246;

class Duck {
    int size;

    public Duck(int duckSize) {
        System.out.println("Quack");
        size = duckSize;  // Initialize size using constructor parameter
        System.out.println("size is " + size);
    }
}

public class UseADuck {
    public static void main(String[] args) {
        Duck d = new Duck(42);  // Create and initialize in one step
    }
}


