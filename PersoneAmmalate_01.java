package esCicli;
import java.util.Scanner;
public class PersoneAmmalate_01 {
    public static void main(String[] args) {
        int tassoPropagazione, popolazione, contagi = 1, giorni = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il tasso di propagazione");
        tassoPropagazione = input.nextInt();
        System.out.println("Inserisci la popolazione");
        popolazione = input.nextInt();
        
        int pop2 = popolazione/2;
        
        while(contagi<pop2){
            giorni += 1;
            contagi += contagi*tassoPropagazione;
        }
        System.out.println("metà della popolazione ci mette " + giorni + " giorni ad essere contagiata");
    }
    
}
