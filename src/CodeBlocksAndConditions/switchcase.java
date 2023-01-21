package CodeBlocksAndConditions;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day ;
        System.out.println("Lütfen Günü seçiniz");
        day=scanner.nextInt();

        if (day == 1){
            System.out.println("Bugün Pazartesidir.");

        }else if ( day == 2){

            System.out.println("Bugün Salı.");
        }
        else if ( day == 3){

            System.out.println("Bugün Çarşamba.");
        }
        else if ( day == 4){

            System.out.println("Bugün Perşembe.");
        }else if ( day == 5){

            System.out.println("Bugün Cuma.");
        }else if ( day == 6){

            System.out.println("Bugün Cumartesi.");
        }else if ( day == 7){

            System.out.println("Bugün Pazar.");
        }


        switch (day){
            case 1:
                System.out.println("Bugün Pazartesi");
                System.out.println("program bitti");
                break;
            case 2:
                System.out.println("Bugün Salı");
                break;
            case 3:
                System.out.println("Bugün çarşamba");
                break;
            case 4:
                System.out.println("Bugün Perşembe");
                break;
            case 5:
                System.out.println("Bugün Cuma");
                break;
            case 6:
                System.out.println("Bugün Cumartesi");
                break;
            case 7:
                System.out.println("Bugün pazar");
                break;
            default:
        }

    }
}
