package Main;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("tuğçe\n");
        byte kenan = 122;
        System.out.println(kenan);
        float vFloat = 3.14f;
        float v2Float= 3.14F;
        System.out.println(v2Float+ "\n" + vFloat);

        char c1= 'J';

        char c2= 'A';
        char c3= 'V';
        char c4= 'A';

        System.out.println("" +c1 + c2 +c3 + c4 );

        boolean dogru = true;
        boolean yanlis = false;

        System.out.println(dogru);

        String string = "naber canıms";
        System.out.println(string);

        int a = 7;
        int b=a;
        System.out.println(a+b);

        int c = 0;
        c +=b;
        System.out.println(c);
        int d;
        int f;
        Scanner scanner = new Scanner(System.in);


        System.out.println("input int value..");
        d = scanner.nextInt();

        System.out.println("1.input value ="+d);
        System.out.println("2.input int value..");
        f = scanner.nextInt();

        System.out.println("2.input value ="+f);
        System.out.println(d*f);



    }
}