package Bunch.dummy;

public class Example {
    public static void main(String[] args) {
        int[] array = {1, 2, 3,4,5};
try {
    int result = array[8]; // This will throw ArrayIndexOutOfBoundsException
    System.out.println(result);
    System.out.println(array.length);
}
catch (Exception e){
    throw new ArithmeticException();
}

        int age = (int) 2.9999999;
        System.out.println(age);
    }
}
