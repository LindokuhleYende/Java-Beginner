package chapter8.Page230;

// Abstract superclass defining the basic structure of a report
abstract class Report {

    // Method to set up the report
    void runReport() {
        System.out.println("Setting up report...");
    }

    // Method to print the report
    void printReport() {
        System.out.println("Printing report...");
    }
}

// Subclass of Report that overrides runReport() to add more functionality
class BuzzwordsReport extends Report {

    // Overrides the runReport() method from Report
    @Override
    void runReport() {
        // Call the superclass version of runReport() to reuse setup logic
        super.runReport();

        // Add subclass-specific behavior
        buzzwordCompliance();

        // Call the inherited method to print the report
        printReport();
    }

    // Method specific to the subclass for checking buzzword compliance
    void buzzwordCompliance() {
        System.out.println("Checking buzzword compliance...");
    }
}

// Main class with the entry point of the program
public class Main {

    // main() method is the starting point of the program
    public static void main(String[] args) {
        // Create an instance of BuzzwordsReport
        BuzzwordsReport report = new BuzzwordsReport();

        // Call the overridden runReport() method
        report.runReport();
    }
}
