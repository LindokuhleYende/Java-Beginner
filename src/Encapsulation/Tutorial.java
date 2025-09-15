package Encapsulation;

class Human{
    private int age = 22;
    String name = "Lee";

    public int getAge(){
        return age;
    }

}

public class Tutorial {

    public static void main(String[] args){

        Human h = new Human();
        System.out.println(h.name);
        System.out.println(h.getAge());

    }

}
