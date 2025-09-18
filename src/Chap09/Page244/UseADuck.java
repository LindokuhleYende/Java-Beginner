package Chap09.Page244;


public class UseADuck {
    public static void main(String[] args) {
        Duck duck = new Duck();  // Create a new Duck object
        Dog dog = new Dog();
    }
}

// This is the Duck class
class Duck {

    // Constructor that prints "Quack" when a Duck is created
    public Duck() {
        System.out.println("Quack");
    }
}

class Dog {

    // Constructor that prints "Barks" when a Dog is created
    public Dog() {
        System.out.println("Barks");
    }
}
