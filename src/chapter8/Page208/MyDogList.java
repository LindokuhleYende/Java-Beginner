package chapter8.Page208;

// Class to hold a list of Dogs
public class MyDogList {
    private Dog[] dogs = new Dog[5];   // Array to store Dog objects, max size 5
    private int nextIndex = 0;         // Tracks the next available position in the array

    public void add(Dog d) {
        if (nextIndex < dogs.length) {       // Check if there is space in the array
            dogs[nextIndex] = d;             // Add the Dog object at nextIndex
            System.out.println("Dog added at " + nextIndex);  // Print confirmation message
            nextIndex++;                     // Move to the next available position
        }
    }
}
