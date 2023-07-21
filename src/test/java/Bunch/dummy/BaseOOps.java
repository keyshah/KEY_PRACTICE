package Bunch.dummy;

import org.testng.Assert;

public class BaseOOps {

    public static String abc;


    public static void main(String[] args) {

        try {
            System.out.println("test1");
            // Assert.fail();
            System.out.println("test2");
            System.out.println("test3");
        } catch (Exception e) {
            Assert.fail();
            System.out.println("test4");
        } finally {
            System.out.println("test5");
        }
        System.out.println("test6");

    }

}
