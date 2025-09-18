package Chap10.Page279;

public class Duck {
    // Instance variable to store the size of a Duck object
    private int size;

    // Static main method - program entry point
    public static void main(String[] args) {
        // ERROR: Trying to use the instance variable 'size' from a static method
        // Java doesn't know which Duck object you're talking about here
//        System.out.println("Size of duck is " + size);  //uncomment to test
        // You will get a compile-time error because 'size' is not static
    }

    // This is a regular (non-static) method to set the duck's size
    public void setSize(int s) {
        size = s;
    }

    // This is a regular (non-static) method to get the duck's size
    public int getSize() {
        return size;
    }
}

