package Chap10.Page287;

public class Foo4 {
    static final int x = 12;

    public void go() {
        System.out.println(x);  // Output: 12
    }

    public static void main(String[] args) {
        Foo4 f = new Foo4();
        f.go();
    }
}

