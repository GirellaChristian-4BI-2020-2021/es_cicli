
package m.c.m_01;

import java.util.Scanner;

public class MCM_01 {

    
    public static void main(String[] args) {
        int numero1, numero2, mcm = 1;
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Inserire il primo numero");
            numero1 = input.nextInt();
        }while(numero1 == 0);
        do{
            System.out.println("Inserire il secondo numero");
            numero2 = input.nextInt();
        }while(numero2 == 0);
        while(flag) {
      if( mcm % numero1 == 0 && mcm % numero2 == 0 ) {
        System.out.printf("L'mcm tra %d e %d è %d  ", numero1, numero2, mcm);
        flag = false;
      }
      mcm++;
    }
  }
}
        
    
    

