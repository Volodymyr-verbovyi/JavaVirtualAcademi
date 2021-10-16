package lesson19;

public class Return {
    public static void main(String[] args) {

        int summa = Summa(5,15);
        System.out.println(summa);
    }


    public static int Summa(int a,int b){

        int summaChisel = a+b;
        return summaChisel;

    }
}


