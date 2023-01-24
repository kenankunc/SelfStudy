package CodeBlocksAndConditions;

import java.util.Scanner;

public class AirCondition {

    /* Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
       Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
       Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
       Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int temperature;
        System.out.println("sıcaklık değerini giriniz...");
        temperature = scanner.nextInt();

        if (temperature < 5 ){
            System.out.println("Kayak yapabilirsiniz..");
        } else if ( (5 <= temperature) && (temperature < 15) ) {
            System.out.println(" Sinamaya gidebilirsiniz..");
        } else if (( 15<= temperature) && (temperature < 25) ) {
            System.out.println("Piknik yapabilirsiniz..");
        }else if ((temperature >= 25) ) {
            System.out.println("Yüzme yapabilirsiniz..");
        }


    }
}
