package CodeBlocksAndConditions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;

        int select ;
        System.out.println("Eğer toplama işlemi yapacaksanız lütfen 1'i seçiniz\n" +
                "Eğer Çıkartma işlemi yapacaksanız lütfen 2'i seçiniz\n"+
                "Eğer Çarpma işlemi yapacaksanız lütfen 3'i seçiniz\n"+
                "Eğer Bölme işlemi yapacaksanız lütfen 4'i seçiniz\n");

        select = scanner.nextInt();
        System.out.println(" Lütfen 1. sayıyı giriniz..");
        a = scanner.nextDouble();
        System.out.println(" Lütfen 2. sayıyı giriniz..");
        b = scanner.nextDouble();



        switch (select){
            case 1:
                System.out.println("Toplama işleminin Sonucu= "+ (a+b));
                break;
            case 2:
                System.out.println("Çıkartma işleminin Sonucu== "+ (a-b));
                break;
            case 3:
                System.out.println("Çarpma işleminin Sonucu="+ (a*b));
                break;
            case 4:
                System.out.println("Bölme işleminin Sonucu= "+ (a/b));
                break;
            default:
        }


    }
}
