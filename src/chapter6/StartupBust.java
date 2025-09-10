package chapter6;

import java.util.ArrayList;

/**
 * StartupBust - A Battleship-style game where players try to sink startup companies
 * instead of ships by guessing their locations on a 7x7 grid.
 */
public class StartupBust {
    // Game helper handles grid management, placement, and user input
    private GameHelper helper = new GameHelper();

    // Dynamic list to store all active startups in the game
    private ArrayList<Startup> startups = new ArrayList<Startup>();

    // Counter to track total number of guesses made by player
    private int numOfGuesses = 0;

    /**
     * Sets up the initial game state by creating startups and placing them on the grid
     */
    private void setUpGame() {
        // CREATE THREE STARTUP OBJECTS
        // Each startup represents a company that occupies 3 grid positions
        Startup one = new Startup();
        one.setName("poniez");        // Set first startup name

        Startup two = new Startup();
        two.setName("hacqi");         // Set second startup name

        Startup three = new Startup();
        three.setName("cabista");     // Set third startup name

        // ADD ALL STARTUPS TO THE GAME LIST
        startups.add(one);
        startups.add(two);
        startups.add(three);

        // DISPLAY GAME INSTRUCTIONS TO PLAYER
        System.out.println("Your goal is to sink three Startups.");
        System.out.println("poniez, hacqi, cabista");
        System.out.println("Try to sink them all in the fewest number of guesses");

        // PLACE EACH STARTUP RANDOMLY ON THE GRID
        for (Startup startup : startups) {
            // GameHelper.placeStartup(3) returns ArrayList of 3 grid positions
            ArrayList<String> newLocation = helper.placeStartup(3);

            // Assign those positions to the current startup
            startup.setLocationCells(newLocation);
        }
    }

    /**
     * Main game loop - continues until all startups are destroyed
     */
    private void startPlaying() {
        // GAME CONTINUES WHILE STARTUPS REMAIN ACTIVE
        // When startups.isEmpty() becomes true, all startups have been sunk
        while (!startups.isEmpty()) {
            // GET PLAYER'S GUESS (e.g., "a3", "b5", etc.)
            String userGuess = helper.getUserInput("Enter a guess");

            // PROCESS THE GUESS AND UPDATE GAME STATE
            checkUserGuess(userGuess);
        }

        // ALL STARTUPS DESTROYED - END THE GAME
        finishGame();
    }

    /**
     * Processes a single player guess against all active startups
     * @param userGuess - The grid coordinate guessed by player (e.g., "a3")
     */
    private void checkUserGuess(String userGuess) {
        // INCREMENT GUESS COUNTER
        numOfGuesses++;

        // DEFAULT RESULT - WILL BE OVERWRITTEN IF HIT OR KILL OCCURS
        String result = "miss";

        // TEST GUESS AGAINST EACH ACTIVE STARTUP
        for (Startup startupToTest : startups) {
            // CHECK IF GUESS HITS THIS STARTUP
            // Returns: "miss", "hit", or "kill"
            result = startupToTest.checkYourself(userGuess);

            // IF HIT BUT STARTUP STILL ALIVE
            if (result.equals("hit")) {
                break;  // Stop checking other startups - one hit per guess
            }

            // IF STARTUP COMPLETELY DESTROYED
            if (result.equals("kill")) {
                // REMOVE DEAD STARTUP FROM ACTIVE LIST
                startups.remove(startupToTest);
                break;  // Stop checking - startup is dead
            }
        }

        // PROVIDE FEEDBACK TO PLAYER
        System.out.println(result);  // Prints "miss", "hit", or "kill"
    }

    /**
     * Handles end-of-game scoring and displays final messages
     */
    private void finishGame() {
        // VICTORY MESSAGE
        System.out.println("All Startups are dead! Your stock is now worthless");

        // PERFORMANCE-BASED FEEDBACK
        if (numOfGuesses <= 18) {
            // EXCELLENT PERFORMANCE
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
        } else {
            // POOR PERFORMANCE
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options");
        }
    }

    /**
     * Program entry point - creates and runs a complete game
     */
    public static void main(String[] args) {
        // CREATE NEW GAME INSTANCE
        StartupBust game = new StartupBust();

        // INITIALIZE GAME (create startups, place on grid, show instructions)
        game.setUpGame();

        // START THE MAIN GAME LOOP
        game.startPlaying();

        // Game automatically ends when startPlaying() completes
    }
}