package Chapter5;

public class SimpleStartupGame {
    public static void main(String[] args) {
        // Keep track of how many guesses the player makes
        int numOfGuesses = 0;

        // Create a helper object to handle user input
        GameHelper helper = new GameHelper();

        // Create a SimpleStartup object (the "target" the player tries to hit)
        SimpleStartup theStartup = new SimpleStartup();

        // Generate a random starting location between 0 and 4
        // (so the ship of length 3 fits in the grid of size 7)
        int randomNum = (int) (Math.random() * 5);

        // Place the ship in 3 consecutive cells starting at randomNum
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theStartup.setLocationCells(locations);

        // Game loop continues until the ship is sunk
        boolean isAlive = true;

        while (isAlive) {
            // Ask the player for their guess (input is expected as a number)
            int guess = helper.getUserInput("enter a number");

            // Check the guess against the ship’s location
            String result = theStartup.checkYourself(guess);

            // Count how many guesses the player has made
            numOfGuesses++;

            // If the ship is sunk ("kill"), end the game
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}

