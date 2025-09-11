package chapter7;
//subclasses that extend Animal

public class Cat extends Animal{
    public void eat() {
        System.out.println("Cat is eating.");
    }

    public void roam() {
        System.out.println("Cat is roaming.");
    }

    public void makeNoise() {
        System.out.println("Cat meows.");
    }
}
