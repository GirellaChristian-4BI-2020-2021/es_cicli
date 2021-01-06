package personeAmmalate_02;
import java.util.Scanner;
public class personeAmmalate_02 {
    public static void main(String[] args) {
        int giorni = 0;
        double ammalati, guariti, percentuale;
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il numero di ammalati");
        ammalati = input.nextDouble();
        System.out.println("Inserisci la percentuale di guariti giornaliera");
        guariti = input.nextDouble();
        
        while(ammalati>=100){
                giorni += 1;
                percentuale = (guariti/100)*ammalati;
                ammalati -= percentuale;
        }
        System.out.println("i contagiati ad arrivare sotto i 100 ci impiega " + giorni + " giorni");
    }
}
