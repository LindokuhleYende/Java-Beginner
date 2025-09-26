package Flow;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        String item1 = "Hat";
        String item2 = "Shirt";
        String item3 = "Shoe";

        String[] items = {item1,item2,item3};

        System.out.println(Arrays.toString(items));


        int[] age = new int[3];
        age[0]=10;
        age[1]=20;
        age[2]=30;

        System.out.println(Arrays.toString(age));
        System.out.println(age[0]);

        int[] sizes = {4,18, 5,20};

        for(int size:sizes){
            if (size > 16) {
                break;
            }
            System.out.println(size);

        }

    }
}
