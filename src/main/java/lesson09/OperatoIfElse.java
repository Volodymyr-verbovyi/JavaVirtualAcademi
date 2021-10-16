package lesson09;

public class OperatoIfElse {
    public static void main(String[] args) {
        int tavriya = 10000;
        int audi = 28;
        int ferari = 200000;

        int zarplata = 200000;

        if (zarplata == tavriya) {
            System.out.println("Я куплю таврию");
        } else if (zarplata == audi) {
            System.out.println("Я зможу купыты Ауди");
        } else if (zarplata == ferari) {
            System.out.println("Ferari ");
        } else {
            System.out.println(" Naif");
        }
    }
}
