/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AvionMesto;

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
        Avion a = new Avion();
        a.uvediPutnika(20, "Jovan Jovanovic", 53);
        a.uvediPutnika(30, "Milos Milosevic", 33);
        a.uvediPutnika(40, "Ana Jovanovic", 40);
        
        a.ispis();
        a.ispisiJovanovice();
        System.out.println("Prosecna starost putnika je: "+a.prosecnaStarost()+" godina");
        System.out.println("Najmladji putnik ima "+a.najmladjiPutnik()+" godina");
        System.out.println("Procentualna zauzetos aviona je "+a.procentualnaZauzetost()+" %");
    }
    
}
