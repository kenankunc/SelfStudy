package CodeBlocksAndConditions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserLoginPage {


    public static void main(String[] args) {

        String userName,password,newpassword=null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your username for login");
        userName=scanner.nextLine();
        System.out.println("Please input your password");
        password=scanner.nextLine();
        int  reset;

        if((userName.equals("kenan")) && (password.equals("test"))){
            System.out.println("Welcome..");

        }else if (!userName.equals("kenan") || !password.equals("test") ) {
            System.out.println("Username or password Incorrect   ");
        }
        if (!password.equals("test")){
            System.out.println("If you forget your password you can reset or not");
            System.out.println("If you want to change password you should select 1 if you don't want to change select 0" );
            reset=scanner.nextInt();
            if (reset == 1){
                System.out.println("şifre değiştirme ekranı");
                scanner.nextLine();
                password=scanner.nextLine();
                if(password.equals("test")){
                    System.out.println("you can't give same password please try again..");

                    password=scanner.nextLine();
                }else {
                    System.out.println("yeni şifreniz.."+password);
                    newpassword= password;
                }if (userName.equals("kenan") && (password.equals(newpassword))){
                    System.out.println("Yeni şifreniz ile giriş yaptınız..");
                }
            } else if( reset == 0){
                System.out.println("şifre değiştirilmemiştir..");
            }
        }
        System.out.println("Programımız şimdilik bu kadar... :)");

    }
}
