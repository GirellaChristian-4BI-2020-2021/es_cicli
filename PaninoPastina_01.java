package paninopastina_01;
import java.util.Scanner;
public class PaninoPastina_01 {

    
    public static void main(String[] args) {
        int giorni = 0, panino = 0, pastina = 0;
        float soldi;
        String risposta;
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.println("Quanti soldi ha Mario?");
        soldi = input.nextInt();
        while(soldi>=1 && flag == true){
            System.out.println(soldi);
            System.out.println("cosa mangia Mario?");
            risposta = in.nextLine();
            if(risposta.equalsIgnoreCase("pastina")){
                soldi -= 1;
                giorni += 1;
                pastina += 1;
            }
            else if(risposta.equalsIgnoreCase("panino")){
                if(soldi>=1.5){
                soldi -= 1.5;
                giorni += 1;
                panino += 1;
                }
            }
            else{
                System.out.println("no");
                flag = false;
            }
            
        }
        System.out.println("Mario ha mangiato " + giorni + " giorni");
        System.out.println("Mario ha mangiato " + panino + " panini");
        System.out.println("Mario ha mangiato " + pastina + " pastine");
    }
    
}
