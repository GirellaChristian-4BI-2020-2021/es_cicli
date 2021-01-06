package quantecifre_01;
import java.util.Scanner;

public class QuanteCifre_01 {

    public static void main(String[] args) {
        int numero = 0, len;
        String s;
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire il numero");
        numero = input.nextInt();
        s = Integer.toString(numero);
        len = s.length();
        System.out.println("La lunghezza del numero è di " + len + " cifre");

    }
}
