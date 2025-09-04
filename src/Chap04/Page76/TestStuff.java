package Chap04.Page76;

public class TestStuff {

    void takeTwo(int x, int y) {
        int z = x + y;
        System.out.println("Total is " + z);
    }

    void go() {
        TestStuff t = new TestStuff();
        t.takeTwo(12, 34);
    }

    public static void main(String[] args) {
        TestStuff tester = new TestStuff();
        tester.go();
    }
}

