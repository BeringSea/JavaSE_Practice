/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Osoba;

/**
 *
 * @author David
 */
public class OsobaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Osoba o1 = new Osoba();
        Osoba o2 = new Osoba();
        o1.setIme("Pera");
        o1.setPrezime("Peric");
        o1.setJbmg("1010980710034");
        o2.setIme("Pera");
        o2.setPrezime("Peric");
        o2.setJbmg("1010980710034");
        
        o1.equals(o2);
        System.out.print(o1);
        System.out.println();
    }
    
}
