package Bunch.Maths;

import java.util.ArrayList;
import java.util.HashSet;

public class listset {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("test");
        System.out.println(list);


        HashSet<String> hash = new HashSet<>(list);
        System.out.println(hash);
    }
}
