package dummy;

public class fibonaciseries {
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;
        for (int i = 0; i < 20; i++) {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            if (n3 > 50) {
                break;
            }
            if (n3 > 25) {
                System.out.println(n3);

            }

        }

    }
}
