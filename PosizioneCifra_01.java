package posizionecifra_01;

import java.util.Scanner;

public class PosizioneCifra_01 {

    public static void main(String[] args) {
        int len, j = 0;
        int numero;
        String s;
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire il numero");
        numero = input.nextInt();
        s = Integer.toString(numero);
        for (int i = s.length()-1; i > 0; i--) {
            if (Character.getNumericValue(s.charAt(i)) < j) {
                flag = false;
            }
            j++;

        }
        if (flag) {
            System.out.println("La proprietà è rispettata");
        } else {
            System.out.println("la proprietà non è rispetatta");
        }

    }

}
