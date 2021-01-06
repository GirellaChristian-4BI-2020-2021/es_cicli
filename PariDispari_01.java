package paridispari_01;
import java.util.Scanner;

public class PariDispari_01 {

    
    public static void main(String[] args) {
        int numero = 0, len, pari = 0, dispari = 0;
        String s;
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire il numero");
        numero = input.nextInt();
        s = Integer.toString(numero);
        len = s.length();
        for(int i = 0; i<s.length(); i++){
            if(Character.getNumericValue(s.charAt(i))%2==0){
               pari++;
            }
            else{
                dispari++;
            }
        }
        System.out.printf("Il numero è composta da %d cifre pari e da %d cifre dispari ", pari, dispari);
  }
    
}
