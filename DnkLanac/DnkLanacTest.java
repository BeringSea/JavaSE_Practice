/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DnkLanac;

/**
 *
 * @author David
 */
public class DnkLanacTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DnkLanac dnkLanac = new DnkLanac(8);
        dnkLanac.dodajKariku('A');
        dnkLanac.dodajKariku('C');
        dnkLanac.dodajKariku('C');
        dnkLanac.dodajKariku('G');
        dnkLanac.dodajKariku('T');
        dnkLanac.dodajKariku('T');
        dnkLanac.dodajKariku('T');
        dnkLanac.dodajKariku('T');
        
        dnkLanac.ispisKarikaULancu();
        dnkLanac.ispisKarikaULancuObrnuto();
        System.out.println("Broj 'A' karika u lancu "+dnkLanac.brojAKarika());
        System.out.println("Nepopunjen broj karika "+dnkLanac.nepopunjenBrojKarika());
        System.out.println("Trenutna duzina lanca "+dnkLanac.trenutnaDuzina());
    }
    
}
