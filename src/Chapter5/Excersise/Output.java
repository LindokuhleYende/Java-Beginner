package Chapter5.Excersise;

public class Output {
    // Main method: entry point of the program
    public static void main(String[] args) {
        // Create an instance of Output
        Output output = new Output();

        // Call the go() method on the instance
        output.go();
    }

    // Method that contains the core logic
    void go() {
        // Initialize an integer variable 'value' with 7
        int value = 7;

        // Loop from i = 1 to i < 8 (i.e., i = 1 to 7)
        for (int i = 1; i < 8; i++) {
            value++;

            // If i is greater than 4 (i.e., i = 5, 6, 7)
            if (i > 4) {
                System.out.println(++value + " ");
            }

            // If 'value' exceeds 14, print the current value of i and break the loop
            if (value > 14) {
                System.out.println(" i = " + i);
                break; // Exit the loop early

            }
        }
    }
}
