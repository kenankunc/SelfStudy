package Market;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Market {
    public static void main(String[] args) {

        double armut,elma,domates,muz,patlican,toplam;
        double aPrice=2.14,ePrice=3.67,dPrice=1.11,mPrice=0.95,pPrice=5.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç Kilo Armut alacaksınız ?");
        armut=scanner.nextDouble();
        System.out.println("Kaç Kilo Elma alacaksınız ?");
        elma=scanner.nextDouble();
        System.out.println("Kaç Kilo Domates alacaksınız ?");
        domates=scanner.nextDouble();
        System.out.println("Kaç Kilo Muz alacaksınız ?");
        muz=scanner.nextDouble();
        System.out.println("Kaç Kilo Patlıcan alacaksınız ?");
        patlican=scanner.nextDouble();

        toplam=armut*aPrice+elma*ePrice+domates*dPrice+muz*mPrice+patlican*pPrice;
        System.out.println("Toplam Tutar "+ toplam+ " Tl'dir");





    }
}
