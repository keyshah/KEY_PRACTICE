package Bunch.Maths;

public class strinrever {


    public static void main(String[] args) {
        String s = "keyur";
        String rev = "";
        char[] a = new char[s.length()];
        char[] aa = s.toCharArray();
        for (int i = s.length()-1; i >= 0; i--) {
            a[i] = s.charAt(i);
            rev = rev + a[i];
        }

       // System.out.println(Arrays.toString(a));
        System.out.println(rev);

    }

    public void sdada() {
        String a = "This is keyur";
        StringBuilder sb = new StringBuilder(a);
        String ra = String.valueOf(sb.reverse());
        System.out.println(ra);
    }

}
