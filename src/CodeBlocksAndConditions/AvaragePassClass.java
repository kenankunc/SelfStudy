package CodeBlocksAndConditions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AvaragePassClass {
    public static void main(String[] args) {

        int calculus,physics,turkish,chemical,Music;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input Calculus grade");
        calculus= scanner.nextInt();
        System.out.println("Please input physics grade");
        physics= scanner.nextInt();
        System.out.println("Please input turkish grade");
        turkish= scanner.nextInt();
        System.out.println("Please input chemical grade");
        chemical= scanner.nextInt();
        System.out.println("Please input Music grade");
        Music= scanner.nextInt();
        int passGrade = 55;
        int count =0;


        if ((calculus > passGrade) && calculus <= 100 ){
            System.out.println(" Calculus Class is passed");
            count++;
        }else if (calculus <0 || calculus > 100 ){
            System.out.println(calculus+ " your grade is not greater than 100 or less den 0");
        } else {
            count++;
            System.out.println(calculus +" grade is not enough for passing class");
        }
        if (physics > passGrade && physics <= 100 ){
            System.out.println(" physics Class is passed");
            count++;
        }else if ( physics < 0 || physics > 100 ) {
            System.out.println(physics+ " your grade is not greater than 100 or less den 0");
        }else {
            count++;
            System.out.println(physics +" grade is not enough for passing class");
        }
        if (turkish > passGrade && turkish <= 100){
            System.out.println(" turkish Class is passed");
            count++;
        }else if (turkish < 0 || turkish > 100){
            System.out.println(turkish+ " your grade is not greater than 100 or less den 0");
        }else {
            count++;
            System.out.println(turkish +" grade is not enough for passing class");
        }
        if (chemical > passGrade && chemical <= 100 ){
            System.out.println(" chemical Class is passed");
            count++;
        }else if (chemical < 0 || chemical > 100 ){
            System.out.println(chemical + " your grade is not greater than 100 or less den 0");
        }else {
            count++;
            System.out.println(chemical +" grade is not enough for passing class");
        }
        if (Music > passGrade && Music <= 100 ){
            System.out.println(" Music Class is passed");
            count++;
        }else if (Music < 0 || Music > 100 ){
            System.out.println(Music +" your grade is not greater than 100 or less den 0");
        }else {
            count++;
            System.out.println(Music +" grade is not enough for passing class");
        }

        if (count== 0){
            System.out.println("Tüm dersler geçersiz değer girilmiştir.");
        }else {
            System.out.println(count);
        double avgGrade = (calculus+physics+turkish+chemical+Music)/count;
        System.out.println("avarage grade is"+ avgGrade);
        }

    }
}
