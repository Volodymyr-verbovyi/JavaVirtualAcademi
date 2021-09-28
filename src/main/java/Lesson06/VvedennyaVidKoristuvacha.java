package Lesson06;

import java.util.Scanner;

public class VvedennyaVidKoristuvacha {

    public static void main(String[] args) {
        System.out.println("Введить свое рик народження: ");
        Scanner myScaner = new Scanner(System.in);
        int vik = 2021 - myScaner.nextInt();

        System.out.println("Привит, ваш вик " + vik);
    }
}
