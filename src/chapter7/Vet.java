package chapter7;
//This class contains the method giveShot(Animal a) that takes any Animal

public class Vet {
    public void giveShot(Animal a) {
        // do horrible things to the Animal at the other end of the 'a' parameter
        a.makeNoise();
        a.roam();
        a.eat();
        System.out.println(); // Adds a blank line
    }
}
