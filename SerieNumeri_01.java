
package serienumeri_01;
import java.util.Scanner;
public class SerieNumeri_01 {
    public static void main(String[] args) {
        int[] numero = new int[1000];
        int num, i =0, cont = 1;
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il numero nuovo");
        num = input.nextInt();
        numero[0] = num;
        while(flag == true){
            i+=1;
            System.out.println("Inserisci il numero nuovo");
            num = input.nextInt();
            numero[i] = num;
            if(numero[i]>numero[i-1]){
                cont+=1;
            }
            else{
                flag = false;
            }
        }
        System.out.println("sono stati inseriti " + cont + " numeri prima dell'interruzione");
    }
    
}
