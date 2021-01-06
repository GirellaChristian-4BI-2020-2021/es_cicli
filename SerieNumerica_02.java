package serienumerica_02;
import java.util.Scanner;
public class SerieNumerica_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numero = new int[100000];
        int num, i = 0;
        boolean flag = true;
        System.out.println("Inserisci un numero");
        num = input.nextInt();
        numero[0] = num;
        while(flag){
            i++;
            System.out.println("Inserisci un numero");
            num = input.nextInt();
            numero[i] = num;
            if(numero[i] == numero[i-2] || numero[i]+numero[i-1]==10){
                flag = false;
            }
        }
    }
    
}
