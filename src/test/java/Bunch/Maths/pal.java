package Bunch.Maths;

public class pal {

    public static void main(String[] args) {

        intpal();
    }

    public static void intpal() {
        int a = 98778;
        int rev = 0;
        int temp = a;


        while (temp > 0) {

            rev = rev * 10 + temp % 10;
            temp = temp / 10;

        }
        System.out.println(rev);

    }
}
