package chapter7;

//This contains the start() method that creates instances of Vet, Dog, and Hippo, then calls vet.giveShot().

//its an instance method that belongs to an object, so you must create an instance of the class
// (e.g., PetOwner owner = new PetOwner(); owner.start();) to call it,
// and it's typically used for organizing non-static logic inside the class.
public class PetOwner {
    public void start() {
        Vet vet = new Vet();
        Dog dog = new Dog();
        Hippo hippo = new Hippo();
        Lion lion = new Lion();
        Cat cat = new Cat();
        vet.giveShot(dog);   // Dog's makeNoise() runs
        vet.giveShot(hippo); // Hippo's makeNoise() runs
        vet.giveShot(cat);
        vet.giveShot(lion);
    }

    public static void main(String[] args) { //This is the entry point of a Java program.
        PetOwner owner = new PetOwner();
        owner.start();
    }
}