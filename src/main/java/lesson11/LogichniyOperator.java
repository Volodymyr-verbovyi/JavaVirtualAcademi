package lesson11;

import java.util.Scanner;

public class LogichniyOperator {
    public static void main(String[] args) {
        int zoloto = 0, sriblo = 0, bronza = 0;

        System.out.println("Загальна килькисть медалей = " + (zoloto + sriblo + bronza));

//        if (zoloto > 0) {
//
//            if (sriblo > 0) {
//                if (bronza > 0) {
//                    System.out.println("Е вси три медали");
//                }
//            }
//        }

        if (zoloto > 0 && sriblo > 0 && bronza > 0) {
            System.out.println(" Е медали всих 3х типив");
        }

        if (zoloto > 0 || sriblo > 0 || bronza > 0) {
            System.out.printf("Е хочаб одна медаль ");
        }
    }
}

class Operator {
    public static void main(String[] args) {
        System.out.println("Vedit vik ");
        Scanner s = new Scanner(System.in);

        int vik = s.nextInt();

        if (vik > 120) {
            System.out.println("Vi obmanuete");
        }

        if (true) {
            System.out.println("Istinna");
        }

        int a=5, b=10;

        if (a==5^ b==9){
            System.out.println("Yes");
        }
        else {
            System.out.println("no");
        }



    }
}
