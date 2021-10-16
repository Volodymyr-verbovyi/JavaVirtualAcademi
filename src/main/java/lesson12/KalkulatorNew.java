package lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class KalkulatorNew {
    public static void main(String[] args) throws IOException {
        Scanner vvidInformacii = new Scanner(System.in);
        BufferedReader test = new BufferedReader(new InputStreamReader(System.in));
        int numbers1, numbers2, result;
        String diya;

        System.out.println("Vvedit pershe chislo: ");
        numbers1 = vvidInformacii.nextInt();

        System.out.println("Vvedit druge chislo: ");
        numbers2 = vvidInformacii.nextInt();

        System.out.println("Введить дию (+-*/): ");
        diya = test.readLine();


        if (diya.equals("+")){
           result = numbers1 + numbers2;
        } else if (diya.equals("-")){
           result = numbers1 - numbers2;
        } else {
            result=0;

        }





        System.out.println(result);




    }
}
