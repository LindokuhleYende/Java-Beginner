package Chap10.Page287;

public class Foo6 {
    int x = 12;

    public static void go(final int x) {
        System.out.println(x);  // Output: whatever you pass in
    }

    public static void main(String[] args) {
        Foo6.go(88);  // Output: 88
    }
}

