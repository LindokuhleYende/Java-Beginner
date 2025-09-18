package Chap10.Page283;

public class Player {
    // Static variable shared by all Player objects
    // Keeps track of how many Player objects have been created
    static int playerCount = 0;

    // Instance variable: each Player has its own name
    private String name;

    // Constructor: runs whenever a new Player is created
    public Player(String n) {
        name = n;
        playerCount++;  // Increase playerCount for every new Player
    }
}
