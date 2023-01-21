package CodeBlocksAndConditions;

public class LogicOperators {

    public static void main(String[] args) {

        //( kontrol edilecek ifade ) ? doğru olması durumunda yapılacaklar : yanlış olması durumunda yapılacaklar
        int a, b;
        a = 10;
        b = (a == 1) ? 20: 30;
        System.out.println( "Value of b is : " +  b );

        b = (a == 10) ? 20: 30;
        System.out.println( "Value of b is : " + b );

        int var1 = 5;
        int var2 = 6;
        if ((var2 = 1) == var1)
            System.out.print(var2);
        else
            System.out.print(var2);


        int x = 20, y = 10;
        if ((x < y) && (y++ < 25)){
            System.out.println(x);
        }else{
            System.out.println(x);
        }
        System.out.println(y);

    }
    }

