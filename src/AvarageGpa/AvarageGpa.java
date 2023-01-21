package AvarageGpa;

import java.util.Scanner;

public class AvarageGpa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // değişkenleri oluşturalım;

        int mat,fizik,kimya,turkce,tarih,muzik;

        System.out.println("Lütfen Matematik Notunu Giriniz");

        mat = scanner.nextInt();

        System.out.println("Lütfen fizik Notunu Giriniz");

        fizik = scanner.nextInt();
        System.out.println("Lütfen kimya Notunu Giriniz");

        kimya = scanner.nextInt();

        System.out.println("Lütfen turkce Notunu Giriniz");

        turkce = scanner.nextInt();

        System.out.println("Lütfen tarih Notunu Giriniz");

        tarih = scanner.nextInt();
        System.out.println("Lütfen muzik Notunu Giriniz");

        muzik = scanner.nextInt();



        double avg;

        avg = (mat+turkce+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Tüm derslerin ortalaması = "+ avg);



    }
}
