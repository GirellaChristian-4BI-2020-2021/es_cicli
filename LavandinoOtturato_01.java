package lavandinootturato_01;

import java.util.Scanner;

public class LavandinoOtturato_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, y, capacità, livelloIni, secondi = 0;
        System.out.println("Inserire quanto riesce a scaricare il lavandino");
        x = input.nextDouble();
        System.out.println("Inserire di quanto si riempie il lavandino");
        y = input.nextDouble();
        System.out.println("Inserire il livello iniziale");
        livelloIni = input.nextDouble();
        System.out.println("Inserire la capacità massima del lavandino");
        capacità = input.nextDouble();
        while(livelloIni>0 && livelloIni<capacità && secondi<20){
            secondi += 1;
            livelloIni -= x;
            System.out.println("Il livello dell'acqua è " + livelloIni + " dopo " + secondi + " secondi");
            if(livelloIni>0 && livelloIni<capacità && secondi<20){
                secondi += 1;
                livelloIni += y/3;
                System.out.println("Il livello dell'acqua è " + livelloIni + " dopo " + secondi + " secondi");
            }
            else{
                System.out.println("Il livello dell'acqua è " + livelloIni + " dopo " + secondi + " secondi");
            }
            
        }
    }

}
