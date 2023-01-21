package BodyRatio;

import java.util.Scanner;

public class BMI {


    public static void main(String[] args) {

        double kg;
        double boy;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your weight as KG");
        kg=scanner.nextDouble();
        System.out.println("Please input height as m");
        boy= scanner.nextDouble();

        double bodymassindex = ((kg)/(boy*boy));
        System.out.println("Your BMI ="+ bodymassindex);



    }
}
