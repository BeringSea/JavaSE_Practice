/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnijaSkupova;

/**
 *
 * @author David
 */
public class Unija {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {            
            //Citanje elemenata skupova
            System.out.println("Broj elemenata prvog i drugog skupa:");
            int n1 = Citaj.Int();
            int n2 = Citaj.Int();
            if(n1<0 || n2<0)
                break;
            //Citanje elemenata skupova
            double[] s1 = new double[n1];
            System.out.println("Elementi prvog skupa: ");
            for(int i=0; i<n1;s1[i++] = Citaj.Double());
            if(n1==0)
                System.out.println();
            double[] s2 = new double[n2];
            System.out.println("Elementi drugog skupa: ");
            for (int i = 0; i < n2; s2[i++] = Citaj.Double());
            if(n2==0)
                System.out.println();
            //Nalazenje unije skupova
            double[] s3 = new double[n1+n2];
            int n3 = 0;
            while(n3<n1)
                s3[n3]=s1[n3++];
            for(int j=0; j<n2; j++){
                int i =0;
                while(i<n1 && s2[j]==s1[i])
                    i++;
                if(i == n1)
                    s3[n3++] = s2[j];
            }
            double[] pom = new double[n3];
            for (int i = 0; i < n3; pom[i]=s3[i++]);
            s3=pom;
            pom = null;
            //Ispisivanje rezultata
            System.out.println("Unija pocetnih skupova: ");
            for(int i=0; i<n3; System.out.printf(" %.2f",s3[i++]));
            System.out.print("\n\n");
        }
    }
    
}
