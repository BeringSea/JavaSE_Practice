/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RacunanjeStatickihPokazatelja;

/**
 *
 * @author David
 */
public class Statistika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {            
            System.out.println("\nBroj elemenata niza?\n");
            int n = Citaj.Int();
            if(n <= 0) break;
            System.out.print("Elementi niza?\n");
            double s=0, d=0;
            for (int i = 1; i < n; i++) {
                double a = Citaj.Double();
                s+=a;
                d+=a*a;
            }
            s /= n;
            d = Math.sqrt(d/n - s*s);
            System.out.println("Srednja vrednnost: "+s);
            System.out.println("Standardna devijacija: "+d);
        }
    }
    
}
