/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MotociklSerializable;

/**
 *
 * @author David
 */
public class MotociklTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MotociklBaza mb = new MotociklBaza();
        Motocikl m1 = new Motocikl();
        Motocikl m2 = new Motocikl();
        
        m1.setMarka("Honda");
        m1.setModel("CB 750 F");
        m1.setKubikaza(748);
        
        m2.setMarka("Kawasaki");
        m2.setModel("ER 5");
        m2.setKubikaza(498);
        
        mb.unesiUBazu(m1);
        mb.unesiUBazu(m2);
        //mb.ispisi();
        mb.upisiUFajl();
        mb.popuniListuIzFajla();
        mb.ispisi();
    }
}
