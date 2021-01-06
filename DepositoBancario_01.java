package depositobancario_01;
import java.util.Scanner;
public class DepositoBancario_01 {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo = 0, interesse = 0, soglia = 0, percentuale;
        int anni = 0;
        System.out.println("Inserire saldo iniziale");
        saldo = input.nextInt();
        System.out.println("Inserisci la percentuale di interesse (solo numero)");
        interesse = input.nextInt();
        System.out.println("Inserisci la soglia massima");
        soglia = input.nextInt();
        while(saldo<=soglia){
            anni+=1;
            percentuale = (saldo/100)*interesse;
            saldo += percentuale;
}
        System.out.println("ci si impiega "+ anni + " anni a raggiungere la soglia");
    }
    
    
}
