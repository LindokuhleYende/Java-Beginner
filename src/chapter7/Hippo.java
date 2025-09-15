package chapter7;

//subclasses that extend Animal

public class Hippo extends Animal {
    @Override
    public void eat() {
        System.out.println("Hippo is eating.");
    }

    @Override
    public void makeNoise() {
        System.out.println("Hippo grunts.");
    }
}