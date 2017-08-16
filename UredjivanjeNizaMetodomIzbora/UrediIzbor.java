/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UredjivanjeNizaMetodomIzbora;

/**
 *
 * @author David
 */
public class UrediIzbor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            //citanje duzine niza
            System.out.println("\nUnesite duzinu niza: ");
            int n = Citaj.Int();
            if(n<=0) break;
            // Stvaranje i ispisivanje niza
            System.out.println("Pocetni niz: ");
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print((a[i] = (int)(Math.random()*10))+ " ");
                if(i%30==29 || i == n-1)
                    System.out.println();
            }
            // Uredjivanje niza
            for(int i=0; i<n-1; i++){
                for(int j=i+1; j<n; j++){
                    if(a[i]>a[j]){
                        int b = a[i];
                        a[i] = a[j];
                        a[j] = b;
                    }
                }
            }
            //Ispisivanje uredjenog niza
            System.out.print("Uredjeni niz:\n\n");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
                if(a[i]%30 == 29 || i == n-1)
                    System.out.println();
            }
        }
    }
    
}
