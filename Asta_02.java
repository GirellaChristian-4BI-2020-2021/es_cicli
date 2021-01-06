package asta_02;
import java.util.Scanner;
public class Asta_02{
    public static void main(String[] args) {
        float compratore1 = 0, compratore2 = 0, numero1 = 0, numero2 = 0;
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        while(flag){
            numero1 = 0;
            do{System.out.println("compratore 1 quanto offri?");
            numero1 = input.nextFloat();
            if(compratore1+numero1>compratore2){
            compratore1 += numero1;
            }
            }while(compratore1<=compratore2 && numero1!=0);
            if(numero1 == 0){
                flag = false;
               
            }
            if(numero1 != 0){
                numero2 = 0;
            do{System.out.println("compratore 2 quanto offri?");
            numero2 = input.nextFloat();
            if(compratore2+numero2>compratore1){
            compratore2 += numero2;
            }
            }while(compratore2<=compratore1 && numero2!=0);
            if(numero2 == 0){
                flag = false;
            }
            if(compratore2<compratore1){
                flag = false;
            }
            }
        }
        if(numero1 == 0){
        System.out.println("Ha vinto il compratore 2 offrendo " + compratore2);
    }
        else{
            System.out.println("Ha vinto il compratore 1 offrendo " + compratore1);
        }}
    
}
