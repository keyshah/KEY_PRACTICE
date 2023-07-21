package Bunch.dummy;

import org.openqa.selenium.ElementNotInteractableException;

public class TryCatchDemo {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Before Division");
        try {
            System.out.println(i / 0);
        } catch (ElementNotInteractableException e) {
            System.out.println("test");
        }
        catch (ArithmeticException e) {
            System.out.println("test123");
        }
        System.out.println("After Division");
    }

}
