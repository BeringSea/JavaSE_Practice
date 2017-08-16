/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vozilo;

/**
 *
 * @author David
 */
public class VoziloTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automobil automobil = new Automobil();
        automobil.setMarka("Mercedes");
        automobil.setModel("E220");
        Avion avion = new Avion();
        avion.setMarka("Boeing");
        avion.setModel("747");
        
        automobil.ispisiAutomobil();
        automobil.ispisi();
        avion.ispisiAvion();
        avion.ispisi();
    }
    
}
