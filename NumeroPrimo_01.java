
package numeroprimo_01;

import java.util.Scanner;

public class NumeroPrimo_01 {

    
    public static void main(String[] args) {
        int numero = 0;
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire il numero");
        numero = input.nextInt();
        if(numero%2==0){
            flag = false;
        }
        for(int i = 3; i*i<=numero; i+= 2){
            if(numero%i==0){
                flag = false;
            }
            else{
                flag = true;
            }
        }
        if(flag){
            System.out.println("Il numero è primo");
        }
        else{
            System.out.println("Il numero non è primo");
        }
    }
    
}
