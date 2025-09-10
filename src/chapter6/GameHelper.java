package chapter6;

import java.util.*;

/**
 * GameHelper class handles all the technical aspects of grid management,
 * startup placement, coordinate conversion, and user input for the Startup Bust game.
 * This is the "engine" that manages the 7x7 game board behind the scenes.
 */
public class GameHelper {
    // GRID CONFIGURATION CONSTANTS
    private static final String ALPHABET = "abcdefg";     // Letters for columns (a-g)
    private static final int GRID_LENGTH = 7;             // 7x7 grid dimensions
    private static final int GRID_SIZE = 49;              // Total grid positions (7*7)
    private static final int MAX_ATTEMPTS = 200;          // Max tries to place a startup

    // PLACEMENT DIRECTION CONSTANTS
    static final int HORIZONTAL_INCREMENT = 1;            // Move 1 position right for horizontal
    static final int VERTICAL_INCREMENT = GRID_LENGTH;    // Move 7 positions down for vertical

    // GAME STATE VARIABLES
    private final int[] grid = new int[GRID_SIZE];        // Tracks occupied positions (0=free, 1=occupied)
    private final Random random = new Random();          // Random number generator for placement
    private int startupCount = 0;                         // Counter for placed startups (alternates H/V)

    /**
     * Gets user input from console with a prompt
     * @param prompt - Message to display to user
     * @return User's input converted to lowercase
     */
    public String getUserInput(String prompt) {
        // DISPLAY PROMPT TO USER
        System.out.print(prompt + ": ");

        // GET INPUT FROM KEYBOARD
        Scanner scanner = new Scanner(System.in);

        // RETURN INPUT IN LOWERCASE (for consistent coordinate matching)
        return scanner.nextLine().toLowerCase();
    } // end getUserInput

    /**
     * Main method to place a startup on the grid
     * Finds a valid random position and returns the coordinates
     * @param startupSize - Number of grid positions the startup occupies
     * @return ArrayList of coordinate strings (e.g., ["a0", "a1", "a2"])
     */
    public ArrayList<String> placeStartup(int startupSize) {
        // ARRAY TO HOLD NUMERIC GRID INDICES (0-48)
        int[] startupCoords = new int[startupSize]; // current candidate coordinates

        int attempts = 0;                           // current attempts counter
        boolean success = false;                    // flag = found a good location?
        startupCount++;                            // increment startup counter (for H/V alternation)
        int increment = getIncrement();            // get direction: horizontal(1) or vertical(7)

        // MAIN PLACEMENT SEARCH LOOP
        // Keep trying until we find a valid position or hit max attempts
        while (!success & attempts++ < MAX_ATTEMPTS) {

            // GET RANDOM STARTING POSITION (0-48)
            int location = random.nextInt(GRID_SIZE);

            // BUILD CONSECUTIVE POSITIONS FOR THIS STARTUP
            for (int i = 0; i < startupCoords.length; i++) {
                startupCoords[i] = location;        // put current location in array
                location += increment;              // calculate the next location
            }

            // DEBUG: Uncomment to see placement attempts
            // System.out.println("Trying: " + Arrays.toString(startupCoords));

            // CHECK IF THIS PLACEMENT IS VALID
            if (startupFits(startupCoords, increment)) {     // startup fits on the grid?
                success = coordsAvailable(startupCoords);    // ...and locations aren't taken?
            }
        } // end while

        // VALID PLACEMENT FOUND - FINALIZE IT
        savePositionToGrid(startupCoords);                   // mark grid positions as occupied
        ArrayList<String> alphaCells = convertCoordsToAlphaFormat(startupCoords);

        // INFORM ABOUT PLACEMENT (for debugging/confirmation)
        System.out.println("Placed startup at: " + alphaCells);

        return alphaCells;                                   // return user-friendly coordinates
    } // end placeStartup

    /**
     * Checks if a startup placement fits within grid boundaries
     * @param startupCoords - Array of proposed grid positions
     * @param increment - Direction of placement (1=horizontal, 7=vertical)
     * @return true if startup fits properly, false otherwise
     */
    private boolean startupFits(int[] startupCoords, int increment) {
        // GET THE FINAL (LAST) POSITION OF THE STARTUP
        int finalLocation = startupCoords[startupCoords.length - 1];

        if (increment == HORIZONTAL_INCREMENT) {
            // HORIZONTAL PLACEMENT CHECK
            // Ensure start and end positions are on the same row
            // (prevents wrapping from end of one row to start of next)
            return calcRowFromIndex(startupCoords[0]) == calcRowFromIndex(finalLocation);
        } else {
            // VERTICAL PLACEMENT CHECK
            // Simply ensure the final position doesn't go beyond grid bottom
            return finalLocation < GRID_SIZE;
        }
    } // end startupFits

    /**
     * Checks if all proposed positions are available (not already occupied)
     * @param startupCoords - Array of proposed grid positions to check
     * @return true if all positions are free, false if any are occupied
     */
    private boolean coordsAvailable(int[] startupCoords) {
        // CHECK EACH PROPOSED POSITION
        for (int coord : startupCoords) {
            // IF THIS POSITION IS ALREADY TAKEN (marked as 1)
            if (grid[coord] != 0) {
                // DEBUG: Uncomment to see conflicts
                // System.out.println("position: " + coord + " already taken.");
                return false;                       // CONFLICT FOUND - placement invalid
            }
        }
        return true;                               // NO CONFLICTS - all positions available
    } // end coordsAvailable

    /**
     * Permanently marks grid positions as occupied by saving to the grid array
     * @param startupCoords - Array of grid positions to mark as used
     */
    private void savePositionToGrid(int[] startupCoords) {
        // MARK EACH POSITION AS OCCUPIED
        for (int index : startupCoords) {
            grid[index] = 1;                       // mark grid position as 'used'
        }
    } // end savePositionToGrid

    /**
     * Converts numeric grid indices to user-friendly alphabetic coordinates
     * @param startupCoords - Array of numeric positions (e.g., [0, 1, 2])
     * @return ArrayList of alpha coordinates (e.g., ["a0", "a1", "a2"])
     */
    private ArrayList<String> convertCoordsToAlphaFormat(int[] startupCoords) {
        ArrayList<String> alphaCells = new ArrayList<String>();

        // CONVERT EACH NUMERIC COORDINATE
        for (int index : startupCoords) {
            // CONVERT TO ALPHA FORMAT (e.g., 0 -> "a0", 8 -> "b1")
            String alphaCoords = getAlphaCoordsFromIndex(index);
            alphaCells.add(alphaCoords);           // add to result list
        }

        return alphaCells;                         // return the "a0"-style coords
    } // end convertCoordsToAlphaFormat

    /**
     * Converts a single numeric grid index to alphabetic coordinate format
     * @param index - Numeric position (0-48)
     * @return String coordinate (e.g., "a0", "b3", "g6")
     */
    private String getAlphaCoordsFromIndex(int index) {
        int row = calcRowFromIndex(index);                    // get row value (0-6)
        int column = index % GRID_LENGTH;                     // get column value (0-6)
        String letter = ALPHABET.substring(column, column + 1); // convert column to letter (a-g)

        return letter + row;                                  // combine: "a0", "b3", etc.
    } // end getAlphaCoordsFromIndex

    /**
     * Calculates which row a grid index belongs to
     * @param index - Numeric grid position (0-48)
     * @return Row number (0-6)
     */
    private int calcRowFromIndex(int index) {
        // INTEGER DIVISION: 0-6=row0, 7-13=row1, 14-20=row2, etc.
        return index / GRID_LENGTH;
    } // end calcRowFromIndex

    /**
     * Determines placement direction based on startup count
     * Alternates between horizontal and vertical placement
     * @return HORIZONTAL_INCREMENT (1) or VERTICAL_INCREMENT (7)
     */
    private int getIncrement() {
        if (startupCount % 2 == 0) {              // if EVEN startup number (2nd, 4th, 6th...)
            return HORIZONTAL_INCREMENT;           // place horizontally
        } else {                                  // if ODD startup number (1st, 3rd, 5th...)
            return VERTICAL_INCREMENT;             // place vertically
        }
    } // end getIncrement

} // end class

/*
 * KEY CONCEPTS DEMONSTRATED:
 *
 * 1. GRID REPRESENTATION: Uses 1D array to represent 2D grid (more memory efficient)
 *
 * 2. COORDINATE CONVERSION: Seamlessly converts between numeric indices (0-48)
 *    and user-friendly format ("a0"-"g6")
 *
 * 3. COLLISION DETECTION: Ensures startups don't overlap or go out of bounds
 *
 * 4. PLACEMENT ALGORITHM: Intelligent random placement with validation
 *
 * 5. ALTERNATING PATTERNS: Even/odd logic creates varied gameplay
 *
 * 6. BOUNDARY CHECKING: Prevents horizontal startups from wrapping across rows
 */