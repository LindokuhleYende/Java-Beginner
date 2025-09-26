package Flow;

public class ShopApp {

    public static void main(String[] args) {
        String[] Clothing = new String[4];
        Clothing[0] = "T-shirt";
        Clothing[1] = "Shorts";
        Clothing[2] = "Jeans";
        Clothing[3] = "Shirts";

        Customer c1 = new Customer("S");
        int measurable = 7;

        switch(measurable) {
            case 1,2, 3:
                System.out.println("S");
                break;
            case 4: case 5: case 6:
                System.out.println("M");
                break;

                case 7,8,9:
                    System.out.println("L");
                    break;
                default:
                    System.out.println("X");

        }
    }
}
