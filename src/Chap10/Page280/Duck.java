package Chap10.Page280;

public class Duck {
    // Instance variable to store the size of a Duck object
    private int size;

    // Static main method - program entry point
    public static void main(String[] args) {
        // This will cause a compile error because getSize() is non-static
        // and main() is static. Static methods cannot directly call non-static methods.
//        System.out.println("Size is " + getSize());  //uncomment to test
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

