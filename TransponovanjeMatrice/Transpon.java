/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransponovanjeMatrice;

/**
 *
 * @author David
 */
public class Transpon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            //Citanje dimenzija matrice
            System.out.println("Broj redova i kolona?");
            int m = Citaj.Int();//redovi
            int n = Citaj.Int();//kolone
            if(m<=0 || n<=0)
                break;
            //Citanje elemenata matrice
            int[][] a = new int[m][n];
            for(int i=0; i<a.length; i++){
                System.out.print(i+1 + ". red ");
                for(int j=0;j<a[0].length;a[i][j++] = Citaj.Int());
            }
            //Obrazovanje transponovane matrice
            int[][] b = new int[a[0].length][a.length];
            for(int i=0;i<b.length;i++){
                for(int j=0; j<b[0].length;j++){
                    b[i][j] = a[j][i];
                }    
            }
            //Zamena stare matricie novom
            a=b;
            b=null;
            //Ispisivanje rezultata
            System.out.println("Transponovana matrica:\n");
            for(int[] vrs : a){
                for(int k : vrs){
                    System.out.printf("%5d",k);
                }
                System.out.println();
            }
        }
    }   
}
