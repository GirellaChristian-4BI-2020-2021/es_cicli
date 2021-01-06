package asta_01;
import java.util.Scanner;
public class Asta_01{
    public static void main(String[] args) {
        int compratore1 = 0, compratore2 = 0;
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        while(flag){
            do{System.out.println("compratore 1 quanto offri?");
            compratore1 = input.nextInt();
            }while(compratore1<=compratore2 && compratore1!=0);
            if(compratore1 == 0){
                flag = false;
               
            }
            if(compratore1 != 0){
            do{System.out.println("compratore 2 quanto offri?");
            compratore2 = input.nextInt();
            }while(compratore2<=compratore1 && compratore2!=0);
            if(compratore2 == 0){
                flag = false;
            }
            if(compratore2<compratore1){
                flag = false;
            }
            }
        }
        if(compratore1 == 0){
        System.out.println("Ha vinto il compratore 2 offrendo " + compratore2);
    }
        else{
            System.out.println("Ha vinto il compratore 1 offrendo " + compratore1);
        }}
    
}
