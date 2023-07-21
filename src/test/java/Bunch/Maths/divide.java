package Bunch.Maths;

import java.util.Arrays;

public class divide {
    public static void main(String[] args) {
        int a =50;
        int size;
        int[] div3 = new int[a];
        int[] div5 = new int[a];
        int[] div35 = new int[a];
        int j = 0;

        System.out.println(div3[0]);

        for (int i = 1; i < a; i++) {
            if (i % 3 == 0) {
                // System.out.println("Number is divisible by 3 " + i);
                div3[j] = i;
                j++;
            }
//            if (i % 5 == 0) {
//                //   System.out.println("Number is divisible by 5 " + i);
//                div5[j] = i;
//            }
//            if (i % 3 == 0 && i % 5 == 0) {
//                // System.out.println("Number is divisible by 3 and 5" + i);
//                div35[j] = i;
//            }


        }

        System.out.println(Arrays.toString(div3) + "This are for 3 ");
//        System.out.println(Arrays.toString(div5) + "This are for 5 ");
//        System.out.println(Arrays.toString(div35) + "This are for 3 and 5 ");

    }
}
