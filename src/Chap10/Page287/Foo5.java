package Chap10.Page287;

public class Foo5 {
    static final int x = 12;

    public void go(final int x) {
        System.out.println(x);  // Output: whatever you pass in
    }

    public static void main(String[] args) {
        Foo5 f = new Foo5();
        f.go(99);  // Output: 99
    }
}

