package Chap03.Page61;

class Dog {
    String name;

    public static void main(String[] args) {
        // Make a Dog object and access it
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";
        dog1.eat();
        dog1.chaseCat();


        // Now make a Dog array
        Dog[] myDogs = new Dog[3];

        // Put some Dogs in it
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        // Set names
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";


        // What is myDogs[2]'s name?
        System.out.print("Last dog’s name is ");
        System.out.println(myDogs[2].name);

        // Loop through the array and make them all bark
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark() {
        System.out.println(name + " says Ruff!");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void chaseCat() {
        System.out.println(name + " is chasing a cat!");
    }
}


