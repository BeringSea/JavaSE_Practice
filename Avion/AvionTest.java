/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Avion;

/**
 *
 * @author David
 */
public class AvionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Avion a1 = new Avion();
        Avion a2 = new Avion();
        
        a1.uvediPutnika(0, "Petar Petrovic");
        a1.uvediPutnika(49, "Natasa Jankovic");
        a1.uvediPutnika(19, "Nikola Arsic");
        
        a2.uvediPutnika(1, "Masa Petrovic");
        a2.uvediPutnika(9, "Nikola Tomic");
        a2.uvediPutnika(19, "Nikola Trajkovski");
        
        a1.ispisiStatus();
        a2.ispisiStatus();
        
        a1.ispisiImenaArsica();
    }
    
}
