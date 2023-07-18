package dummy;

import java.util.Arrays;

public class printseries {

    public static void main(String[] args) {

        int[] abc = new int[11];
        int k = 0;
        int i = 25;
        int j = 35;

        for (int a = i; a <= j; a++) {
            System.out.println(a);

            abc[k] = a;
            k++;


        }
        for (int number : abc) {
            System.out.println(number);
        }

        System.out.println(Arrays.toString(abc));
    }
}
