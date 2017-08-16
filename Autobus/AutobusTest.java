/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Autobus;

/**
 *
 * @author David
 */
public class AutobusTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Autobus autobus = new Autobus();
        
        autobus.uvodjenjePutnika(1);
        autobus.uvodjenjePutnika(19);
        autobus.uvodjenjePutnika(49);
        
        
        //autobus.slobodnaZauzetaSedista();
        
        System.out.println("Broj slobodnih mesta "+autobus.brojSlobodnihMesta());
        System.out.println("Broj zauzetih "+autobus.brojZauzetihMesta());
    }
    
}
