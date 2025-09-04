package Chap03.Page59;

public class ArrayExample {
    public static void main(String[] args) {
        int[] nums;               // Step 1: Declare the array variable
        nums = new int[7];        // Step 2: Create array with length 7

        // Step 3: Assign values
        nums[0] = 6;
        nums[1] = 19;
        nums[2] = 44;
        nums[3] = 42;
        nums[4] = 10;
        nums[5] = 20;
        nums[6] = 1;

        // Optional: Print to test
        System.out.println("Element at index 2 is: " + nums[2]);
    }
}

