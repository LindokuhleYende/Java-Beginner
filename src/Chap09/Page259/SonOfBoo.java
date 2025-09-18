//package Chap09.Page259;
//
//// Subclass SonOfBoo extending Boo
//class SonOfBoo extends Boo {
//
//    // Calls super(String) constructor - OK
//    public SonOfBoo() {
//        super("boo");
//    }
//
//    // Calls super(String) constructor - OK
//    public SonOfBoo(int i) {
//        super("Fred");
//    }
//
//    // Calls super(int) constructor - OK
//    public SonOfBoo(String s) {
//        super(42);
//    }
//
//    // No call to super() and no default constructor in Boo,
//    // so compiler inserts super() call here causing error
//    public SonOfBoo(int i, String s) {
//    }
//
//    // Calls super(String, String) constructor - ERROR!
//    // Boo does NOT have constructor Boo(String, String)
//    public SonOfBoo(String a, String b, String c) {
//        super(a, b);
//    }
//
//    // Calls super(String, int) constructor - OK
//    public SonOfBoo(int i, int j) {
//        super("man", j);
//    }
//
//    // Calls super(int, String) constructor - ERROR!
//    // Boo has Boo(String, int) but NOT Boo(int, String)
//    public SonOfBoo(int i, int x, int y) {
//        super(i, "star");
//    }
//}
//
