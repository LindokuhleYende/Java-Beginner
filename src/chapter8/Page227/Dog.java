package chapter8.Page227;

// Define the Pet interface with two methods that all pets should have
interface Pet {
    void beFriendly();  // Method to show friendliness
    void play();        // Method to play
}

// Animal class (general animal class)
class Animal {
    // Method for roaming behavior common to all animals
    public void roam() {
        System.out.println("Animal is roaming");
    }
}

// Dog class extends Animal (inherits Animal behavior)
// and implements Pet (must provide Pet behaviors)
public class Dog extends Animal implements Pet {

    // Implement the beFriendly method from Pet interface
    public void beFriendly() {
        System.out.println("Dog is being friendly");
    }

    // Implement the play method from Pet interface
    public void play() {
        System.out.println("Dog is playing");
    }

    // Dog's own method, specific to Dog class
    public void eat() {
        System.out.println("Dog is eating");
    }

    // Main method to run the program and test Dog behaviors
    public static void main(String[] args) {
        Dog myDog = new Dog();   // Create a new Dog object
        myDog.roam();            // Call Animal method
        myDog.beFriendly();      // Call Pet interface method
        myDog.play();            // Call Pet interface method
        myDog.eat();             // Call Dog's own method
    }
}

