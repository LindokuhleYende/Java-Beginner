package Chap09.Page257;

// This is an abstract class called Animal
// All animals will have a name and a way to get that name
public abstract class Animal {

    // Private instance variable to store the animal's name
    private String name;

    // Constructor that takes a name and assigns it to the instance variable
    public Animal(String theName) {
        name = theName;
    }

    // Getter method to return the name of the animal
    public String getName() {
        return name;
    }
}

