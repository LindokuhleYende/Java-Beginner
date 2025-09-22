package Chap10.Excercise;

class StaticSuper {
    // Static block executes when class is first loaded
    static {
        System.out.println("super static block");
    }

    // Constructor executes when object is created
    StaticSuper() {
        System.out.println("super constructor");
    }
}

public class StaticTests extends StaticSuper {
    static int rand;

    // Static block executes when class is first loaded (after parent's static block)
    static {
        rand = (int) (Math.random() * 6); // Random number 0-5
        System.out.println("static block " + rand);
    }

    // Constructor executes when object is created (after parent's constructor)
    StaticTests() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("in main");
        StaticTests st = new StaticTests();
    }
}

/*
EXECUTION ORDER EXPLANATION:

1. When main() method starts:
   - Prints: "in main"

2. When "new StaticTests()" is encountered:
   - JVM needs to load StaticTests class (first time)
   - Before loading StaticTests, must load parent class StaticSuper

3. Loading StaticSuper class:
   - Static block in StaticSuper executes
   - Prints: "super static block"

4. Loading StaticTests class:
   - Static block in StaticTests executes
   - Generates random number (0-5)
   - Prints: "static block [0-5]"

5. Creating StaticTests object:
   - Parent constructor (StaticSuper) runs first
   - Prints: "super constructor"
   - Child constructor (StaticTests) runs
   - Prints: "constructor"

FINAL OUTPUT (in order):
in main
super static block
static block [random number 0-5]
super constructor
constructor

IMPORTANT NOTES:
- Static blocks run only ONCE when class is first loaded
- If you created another StaticTests object, only constructors would run again
- Parent static block always runs before child static block
- Parent constructor always runs before child constructor
- The random number will be between 0-5 (inclusive)
*/
