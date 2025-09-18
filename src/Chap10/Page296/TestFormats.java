package Chap10.Page296;

public class TestFormats {
    public static void main(String[] args) {

        // Declaring a large number (1 billion) using underscores for better readability
        long myBillion = 1_000_000_000;

        // Formatting the number with commas using String.format
        // "%,d" means: format this number (d = decimal integer) with commas
        String formattedNumber = String.format("%,d", myBillion);

        // Printing the formatted number to the console
        System.out.println(formattedNumber); // Output: 1,000,000,000
    }
}

