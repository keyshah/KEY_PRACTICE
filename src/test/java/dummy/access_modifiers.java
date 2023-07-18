package dummy;

import org.testng.annotations.Test;

public class access_modifiers {

    public int a = 5;
    protected int b = 6;
    int c = 7;
    private final int d = 8;

    @Test
    public static void main(String[] args) {
        access_modifiers c1 = new access_modifiers();
        System.out.println(c1.a);
        System.out.println(c1.b);
        System.out.println(c1.c);
        System.out.println(c1.d);
    }



}
