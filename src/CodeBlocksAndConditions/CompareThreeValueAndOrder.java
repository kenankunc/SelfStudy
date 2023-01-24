package CodeBlocksAndConditions;

import java.util.Scanner;

public class CompareThreeValueAndOrder {

    public static void main(String[] args) {

        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı giriniz..");
        a=scanner.nextInt();
        System.out.println("Lütfen 2. sayıyı giriniz..");
        b=scanner.nextInt();
        System.out.println("Lütfen 3. sayıyı giriniz..");
        c=scanner.nextInt();

        System.out.println("Girilen sayılar ;" +a+","+b+","+c+"");

        if((a>b && a>c) && b>c){
            System.out.println("Sıralı bir şekilde "+" 1. sayımız "+a+" 2.sayımız "+b+" 3. sayımız "+c);

        } else if ((a>b && a>c) && c>b) {
            System.out.println("Sıralı bir şekilde "+"1. sayımız "+a+"2.sayımız "+c+"3. sayımız "+b);

        } else if (b>a && b>c && a>c) {
            System.out.println("Sıralı bir şekilde "+"1. sayımız "+b+"2.sayımız "+a+"3. sayımız "+c);
        }
        else if (b>a && b>c && c>a) {
            System.out.println("Sıralı bir şekilde "+"1. sayımız "+b+"2.sayımız "+c+"3. sayımız "+a);
        }
        else if (c>a && c>b && a>b) {
            System.out.println("Sıralı bir şekilde "+"1. sayımız "+c+"2.sayımız "+a+"3. sayımız "+b);
        }
        else if (c>a && c>b && b>a) {
            System.out.println("Sıralı bir şekilde "+"1. sayımız "+c+"2.sayımız "+b+"3. sayımız "+a);
        }


    }
}
