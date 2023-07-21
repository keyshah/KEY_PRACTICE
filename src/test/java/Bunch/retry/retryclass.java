package Bunch.retry;

import org.testng.annotations.Test;

import java.util.HashMap;

public class retryclass {

    @Test
    public static void main(String[] args) {

        HashMap<String,String> ha = new HashMap<>();
        ha.put("keyur","kajal");
        System.out.println(ha.get("keyur"));
        System.out.println(ha);
        ha.put("admin","adminaaa:amin");
        System.out.println( ha.get("admin").split(":").length);
        String arr[] = ha.get("admin").split(":");

        for (String pakka : arr
             ) {
            System.out.println(pakka);
        }


    }
}
