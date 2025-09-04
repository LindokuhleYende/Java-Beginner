package Chap02.Page39;

public class GuessGame {
    // Three instance variables to hold the three Player objects
    Player p1;
    Player p2;
    Player p3;

    // Method to start the guessing game
    public void startGame() {
        // Create three Player objects and assign them
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // Variables to hold each player's guess
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        // Flags to check if each player guessed correctly, initialized to false
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        // Generate a random target number between 0 and 9
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        // Keep looping until someone guesses the number
        while (true) {
            System.out.println("Number to guess is " + targetNumber);

            // Ask each player to make a guess by calling their guess() method
            p1.guess();
            p2.guess();
            p3.guess();

            // Get the guesses from each player by accessing their 'number' variable
            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            // Check if each guess matches the target number, update the flags accordingly
            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            // If any player guessed correctly, announce the winner(s) and end the game
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is over.");
                break; // exit the loop because game is over
            } else {
                // If no one guessed correctly, the players try again
                System.out.println("Players will have to try again.");
            }
        } // end while loop
    } // end startGame method
} // end GuessGame class

