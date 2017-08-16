/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UredjivanjeNizaMetodomUmetanja;

/**
 *
 * @author David
 */
public class UrediUmet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {            
            //Citanje duzine niza
            System.out.print("Duzina niza:\n");
            int n = Citaj.Int();
            if(n <= 0) break;
            
            //Stvaranje i ispisivanje niza i ispisivanje niza
            System.out.print("Pocetni niz:\n");
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print((a[i]= (int)(Math.random()*10))+" ");
                if(i%30 == 29 || i == n-1)
                    System.out.println();
            }
            // Uredjivanje niza umetanjem
            for (int i = 1; i < n; i++) {
                int b = a[i];
                int j = i - 1;
                while(j >= 0 && a[j]>b)
                    j--;
                a[j+1]=b;
            }
            //Ispisivanje uredjenog niza
            for (int i = 0; i < n; i++) {
                System.out.print(a[i]+" ");
                if(i%30==29 || i==n-1)
                    System.out.println();
            }
        }
    }
    
}
