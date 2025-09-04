package chapter4;

// Define a class named PoorDog
class PoorDog {
    // Private instance variable 'size' (only accessible within this class)
    private int size;

    // Private instance variable 'name' (only accessible within this class)
    private String name;

    // Public method to access the value of 'size'
    public int getSize() {
        return size; // Returns the current value of 'size'
    }

    // Public method to access the value of 'name'
    public String getName() {
        return name; // Returns the current value of 'name'
    }
}

// Define another class to test the PoorDog class
public class PoorDogTestDrive {
    // Main method: entry point of the program
    public static void main(String[] args) {
        // Create a new PoorDog object named 'one'
        PoorDog one = new PoorDog();

        // Print the size of the dog using the getter method
        // Since 'size' was never set, it defaults to 0
        System.out.println("Dog size is " + one.getSize());

        // Print the name of the dog using the getter method
        // Since 'name' was never set, it defaults to null
        System.out.println("Dog name is " + one.getName());
    }
}
