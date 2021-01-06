package alghe_01;
import java.util.Scanner;
public class Alghe_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int popIn = 0, obiettivo = 0, anni = 0, percentuale;
        System.out.println("Inserire la popolazione iniziale");
        popIn = input.nextInt();
        System.out.println("Inserisci l'obiettivo");
        obiettivo = input.nextInt();
        while(popIn<=obiettivo){
            anni+=1;
            popIn = popIn*2;
            if(popIn<=obiettivo){
            anni+=1;
            percentuale = (popIn/100)*33;
            popIn -= percentuale;
        }
        }
        System.out.println("ci impiega " + anni + " anni");
    }
    
}
