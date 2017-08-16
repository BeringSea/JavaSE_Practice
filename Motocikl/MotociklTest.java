/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Motocikl;

import sun.security.krb5.internal.rcache.AuthTimeWithHash;

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
        BazaMotocikala baza = new BazaMotocikala();
        Motocikl m1 = new Motocikl();
        Motocikl m2 = new Motocikl();
        Motocikl m3 = new Motocikl();
        
        m1.setMarka("Honda");
        m1.setModel("CB 750 F");
        m1.setKubukaza(748);
        
        m2.setMarka("Kawasaki");
        m2.setModel("ER 5");
        m2.setKubukaza(498);
        
        m3.setMarka("Honda");
        m3.setModel("CB 750 F");
        m3.setKubukaza(748);
        
        baza.unesiUBazu(m1);
        baza.unesiUBazu(m2);
        baza.unesiUBazu(m3);
        
        if(baza.daLiJeUBazi(m3))
            baza.izbaciIzBaze(m3);
        baza.ispisi();
        baza.ispisiKawasaki();
        
    }
    
}
