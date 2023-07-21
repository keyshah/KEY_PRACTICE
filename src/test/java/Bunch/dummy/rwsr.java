package Bunch.dummy;

public class rwsr {
     int x;
    static public  void main(String[] args) {
        int y = 0;
        rwsr r = new rwsr();
        System.out.println(r.x);
        System.out.println(y);// This will cause a compile-time error
    }
}


