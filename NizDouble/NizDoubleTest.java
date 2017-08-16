/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NizDouble;

/**
 *
 * @author David
 */
public class NizDoubleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NizDouble niz = new NizDouble();
        niz.inicijalizujNiz();
        niz.ucitajElementeNiza();
        System.out.println("Suma elemenata niza je "+niz.sumirajElementeNiza());
    }
}
