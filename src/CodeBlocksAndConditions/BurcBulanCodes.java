package CodeBlocksAndConditions;

import java.util.Scanner;

public class BurcBulanCodes {
    /*

Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart

Ödev
Aynı örneği switch-case kullanmadan yapınız.*/

    public static void main(String[] args) {

        int mount,day;
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen doğduğunuz ay'ı sayı olarak giriniz..");
        mount = scanner.nextInt();
        if (mount >12){
            System.out.println(" Ay 12 den büyük olamaz..");
            return;
        }
        System.out.println("lütfen doğduğunuz gün'ü giriniz..");
        day = scanner.nextInt();
        if(day >31 ){
            System.out.println("girdiğiniz gün değeri 31 den büyük olamaz..");
            return;
        }
        if (day <0 || mount <0){
            System.out.println("Seçilen gün ve ay 0 ve - değer olamaz");
        }


        if ((mount == 3 && day >= 21) || ( mount ==4 && day <=21)){
            System.out.println("Koç burcusunun..");
        } else if ((mount == 4 && day >= 21) || ( mount ==5 && day <=21)) {
            System.out.println("Boğa burcusunun..");
        }else if ((mount == 5 && day >= 22) || ( mount ==6 && day <=22)) {
            System.out.println("ikizler burcusunun..");
        }else if ((mount == 6 && day >= 23) || ( mount ==7 && day <=22)) {
            System.out.println("Yengeç burcusunun..");
        }else if ((mount == 7 && day >= 23) || ( mount ==8 && day <=22)) {
            System.out.println("Aslan burcusunun..");
        }
        else if ((mount == 8 && day >= 23) || ( mount ==9 && day <=22)) {
            System.out.println("Başak burcusunun..");
        }else if ((mount == 9 && day >= 23) || ( mount ==10 && day <=22)) {
            System.out.println("Terazi burcusunun..");
        }
        else if ((mount == 10 && day >= 23) || ( mount ==11 && day <=21)) {
            System.out.println("akrep burcusunun..");
        }
        else if ((mount == 11 && day >= 22) || ( mount ==12 && day <=21)) {
            System.out.println("yay burcusunun..");
        }else if ((mount == 12 && day >= 22) || ( mount ==1 && day <=21)) {
            System.out.println("Oğlak burcusunun..");
        }else if ((mount == 1 && day >= 22) || ( mount ==2 && day <=19)) {
            System.out.println("Kova burcusunun..");
        }else if ((mount == 2 && day >= 20) || ( mount ==3 && day <=20)) {
            System.out.println("Balık burcusunun..");
        }



    }
}
