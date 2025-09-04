package chapter4;

class Horse {
    private double height = 15.2;
    private String breed;
    // more code...
}

class AddThing {
    int a;
    int b = 12;

    public int add() {
        int total;
        total = a + b;
        return total;
    }
}

class Foo {
    public void go() {
        int x = 0;
        int z = x + 3;  // This will cause a compile-time error if run
    }
}

public class TestClasses {
    public static void main(String[] args) {
        AddThing at = new AddThing();
        at.a = 5;
        System.out.println("Sum is: " + at.add());
    }
}


