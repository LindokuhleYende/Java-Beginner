package UserInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserInfoGUIStyled {

    // Method to check if user is an adult
    public static boolean isAdult(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("User Info Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLayout(new GridBagLayout()); // for better alignment
        frame.getContentPane().setBackground(new Color(245, 245, 255)); // soft background

        // GridBag constraints
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // padding
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Title
        JLabel titleLabel = new JLabel("Adult Checker");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setForeground(new Color(50, 50, 150));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        frame.add(titleLabel, gbc);

        // Reset for next components
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;

        // Name
        JLabel nameLabel = new JLabel("Enter your name:");
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(nameLabel, gbc);

        JTextField nameField = new JTextField();
        nameField.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(nameField, gbc);

        // Age
        JLabel ageLabel = new JLabel("Enter your age:");
        ageLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(ageLabel, gbc);

        JTextField ageField = new JTextField();
        ageField.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 1;
        gbc.gridy = 2;
        frame.add(ageField, gbc);

        // Button
        JButton checkButton = new JButton("Check");
        checkButton.setFont(new Font("Arial", Font.BOLD, 16));
        checkButton.setBackground(new Color(100, 149, 237));
        checkButton.setForeground(Color.WHITE);
        checkButton.setFocusPainted(false);
        checkButton.setBorder(BorderFactory.createEmptyBorder(8, 20, 8, 20));

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        frame.add(checkButton, gbc);

        // Result label
        JLabel resultLabel = new JLabel(" ");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));
        resultLabel.setForeground(new Color(34, 139, 34)); // green text
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        frame.add(resultLabel, gbc);

        // Button action
        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                String ageText = ageField.getText().trim();

                try {
                    int age = Integer.parseInt(ageText);
                    boolean adult = isAdult(age);

                    if (adult) {
                        resultLabel.setText("Hello " + name + ", you are an adult.");
                        resultLabel.setForeground(new Color(0, 128, 0)); // green
                    } else {
                        resultLabel.setText("Hello " + name + ", you are not an adult yet.");
                        resultLabel.setForeground(new Color(220, 20, 60)); // red
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter a valid age!");
                    resultLabel.setForeground(Color.RED);
                }
            }
        });

        // Center frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
