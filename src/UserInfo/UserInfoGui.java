package UserInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserInfoGui {

    // Method to check if user is an adult
    public static boolean isAdult(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("User Info Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(new GridLayout(4, 2, 5, 5));

        // Create components
        JLabel nameLabel = new JLabel("Enter your name:");
        JTextField nameField = new JTextField();

        JLabel ageLabel = new JLabel("Enter your age:");
        JTextField ageField = new JTextField();

        JButton checkButton = new JButton("Check");
        JLabel resultLabel = new JLabel("");

        // Button action
        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String ageText = ageField.getText();

                try {
                    int age = Integer.parseInt(ageText);
                    boolean adult = isAdult(age);

                    if (adult) {
                        resultLabel.setText("Hello " + name + ", you are an adult.");
                    } else {
                        resultLabel.setText("Hello " + name + ", you are not an adult yet.");
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter a valid age!");
                }
            }
        });

        // Add components to frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(new JLabel("")); // empty cell for spacing
        frame.add(checkButton);
        frame.add(new JLabel("Result:"));
        frame.add(resultLabel);

        // Show frame
        frame.setVisible(true);
    }
}

