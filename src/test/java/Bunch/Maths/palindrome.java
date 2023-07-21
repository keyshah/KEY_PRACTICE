package Bunch.Maths;

public class palindrome {

    public static void main(String[] args) {

        int a= 5451;

        int temp = a;

        int temp1;
        int temp2;
        int temp3;

        temp1=temp%10;
        System.out.println(temp1);
        temp2=(temp/10)%10;
        System.out.println(temp2);
        temp3=(temp/100)%10;
        System.out.println(temp3);

        int finaltemp = temp1*100+ temp2*10 + temp3;
        System.out.println(finaltemp);

        if(a==finaltemp){
            System.out.println("same");
        }
else {
            System.out.println("bad");
        }

    }
}
