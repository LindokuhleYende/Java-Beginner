package Chap10.Page283;

public class PlayerTestDrive {
    public static void main(String[] args) {
        // Access static variable using class name, before any Player object is created
        System.out.println(Player.playerCount);  // Output: 0

        // Create a new Player object
        Player one = new Player("Tiger Woods");

        // Access static variable again, after creating a Player object
        System.out.println(Player.playerCount);  // Output: 1

        Player two = new Player("LeeYende");
        System.out.println(Player.playerCount);
    }
}

