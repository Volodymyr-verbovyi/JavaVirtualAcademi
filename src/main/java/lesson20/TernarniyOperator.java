package lesson20;

import java.util.Scanner;

public class TernarniyOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1-1000 - Professor
        //1001-55000 - Student
        // 55001 - all personal

        System.out.println("VVedit sviy nomer: ");
        int id = scanner.nextInt();


        double price = 0;
        if (id > 1000 && id < 55000) {
            price = 2.0;
        } else {
            price = 3.0;
        }
        System.out.println("Vash Price" + price);

        //Тернарний оператор можно запиати в один рядок = його фішка
        //System.out.println("ваш вік " + ((vik > 18) ? "повнолітній" : "не повнолітній"));

        double priceOne = (id > 1000 && id < 55000) ? 2.0 : 3.0;
        System.out.println(priceOne);
    }
}
