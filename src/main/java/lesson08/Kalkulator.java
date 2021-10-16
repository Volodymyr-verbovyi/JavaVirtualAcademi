package lesson08;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner vvidInformacii = new Scanner(System.in);

        int numbers1, numbers2, result;

        System.out.println("Vvedit pershe chislo: ");

        numbers1 = vvidInformacii.nextInt();

        System.out.println("Vvedit druge chislo: ");

        numbers2 = vvidInformacii.nextInt();

        result = numbers1 + numbers2;

        System.out.println(result);




    }
}
