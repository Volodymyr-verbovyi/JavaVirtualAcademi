package lesson17;

import java.util.Scanner;

public class MethodParameter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input name:");
        String myName = scanner.nextLine();
        String myCity = scanner.nextLine();
        TwoMethod(myName,myCity);
    }

    public static void TwoMethod(String name, String city) {
        System.out.println(" Bla bla " + name + " from Town" + city);
    }
}
