package Chap10.Page287;

public class Foo {
    static int x;  // defaults to 0

    public void go() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Foo f = new Foo();
        f.go();  // Output: 0
    }
}

