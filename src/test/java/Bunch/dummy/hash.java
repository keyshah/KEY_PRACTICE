package Bunch.dummy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class hash {

    public static void main(String[] args) {

//        int[] aaa ={1,2,3,4};
//        System.out.println(Arrays.toString(aaa));
//
//
//       int[] aaaa = new int[9];
//        System.out.println(aaaa);
        //int [] aaa = new int[size];
        int [] aaaa = {1,2,3,4};
        System.out.println(Arrays.toString(aaaa));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        System.out.println(list);
        list.add(2);
        System.out.println(list);
        System.out.println(list.get(0));
        list.add(1,5);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());
        list.add(1,0);
        list.add(3,0);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
