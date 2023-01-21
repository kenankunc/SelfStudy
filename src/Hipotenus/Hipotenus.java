package Hipotenus;

import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        double a,b,c,uzunluk,x;
        double deneme ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen üçgenin dik kenarlarını giriniz..");
        a= scanner.nextDouble();
        b= scanner.nextDouble();
        c= Math.sqrt((a*a)+(b*b));
        x=(a*a)+(b*b);
        System.out.println("Hipotenüs uzunluğumuz "+c+" kadardır.");

        for (double i = 0; i<=x ; i+= 0.5){

            if(i * i == x){

                System.out.println("i="+i);
            }

        }


       /* float i=0;
        while ( i<= x){
            if( i*i == x){
                //deneme = i;
                System.out.println(i);
            }
            i+=0.10f;


        }*/



    }
}
