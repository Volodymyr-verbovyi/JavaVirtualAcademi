package lesson15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class While {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        String slovo="";

        while (i != 10) {
            System.out.println("Вгадайте число 0 and 10");
            i = scanner.nextInt();
        }

       System.out.println("Молодець");

        while (slovo.equals("чай") != true ){
            System.out.println("Хочу чаю");
            slovo=bufferedReader.readLine();
        }
    }
}
