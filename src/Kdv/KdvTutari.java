package Kdv;

import java.util.Scanner;

public class KdvTutari {

    public static void main(String[] args) {
        double urunfiyati;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen ürünün fiyat bilgisi giriniz...");
        urunfiyati = scanner.nextDouble();
        System.out.println("ürünün fiyatı "+ urunfiyati + "TL olarak belirlenmiştir...");


        double kdvorani;
        System.out.println("Lütfen kdv oranını belirleyiniz..");
        kdvorani = scanner.nextDouble();
        System.out.println("KDV oranı %" +kdvorani + "'dir" );

        double kdvliurunfiyati;

        double urununkdvsi;

        urununkdvsi = urunfiyati * kdvorani /100;
        System.out.println("Ürünün KDV tutarı "+ urununkdvsi+"TL'dir.");
        kdvliurunfiyati = urunfiyati + urununkdvsi;

        System.out.println("ürünümüzün fiyatı ="+ kdvliurunfiyati+"TL'dir");

    }
}
