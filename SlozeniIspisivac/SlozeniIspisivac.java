/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SlozeniIspisivac;

/**
 *
 * @author David
 */
public class SlozeniIspisivac {
   
    public static void IspisiMatricu(){
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 4; j++)
                System.out.print(1 + " ");
                System.out.println();
        }
    }
    
    public static void ispisiMinDeljivSa12i15i9(){
        for (int i = 10; i < 1000; i++) {
            if((i%12==0) && (i%15==0) && (i%9==0)){
                 System.out.print(i + " ");
                 break;
            }  
        }
    }
    
    public static void opadajuciOd50Do1(){
        for (int i = 50; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
    public static void granicneVrednosti(int A, int B){
        for(int i = B; i>=A; i--){
            System.out.print(i + " ");
        }
    }
}
