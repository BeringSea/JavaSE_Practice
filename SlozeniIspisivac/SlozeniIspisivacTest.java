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
public class SlozeniIspisivacTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // SlozeniIspisivac.IspisiMatricu();
        //SlozeniIspisivac.ispisiMinDeljivSa12i15i9();
        //SlozeniIspisivac.opadajuciOd50Do1();
        System.out.println("Unesite granicne vrednosti A i B");
        int A = Citaj.Int();
        int B = Citaj.Int();
        SlozeniIspisivac.granicneVrednosti(A, B);
    }
}
