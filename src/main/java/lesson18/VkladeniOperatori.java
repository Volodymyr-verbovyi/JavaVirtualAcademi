package lesson18;

public class VkladeniOperatori {
    public static void main(String[] args) {

        int vik = 17;

        if (vik < 15) {
            System.out.println("you small ");
            if (vik <= 10) {
                System.out.println(" You all small ");
            } else {
                System.out.println("Ще почекайте");
            }
        } else {
            System.out.println("Vse OK ");
            switch (vik){
                case  17:
                    System.out.println("17");
                    break;
                default:
                    System.out.println(" Ще не скороо повнолиття ");
                    break;
            }
        }
    }
}
