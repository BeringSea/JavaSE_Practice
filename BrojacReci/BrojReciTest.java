/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BrojacReci;

/**
 *
 * @author David
 */
public class BrojReciTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int brojReciLep = BrojReci.brojReciLep("lep lep");
        int brojReci = BrojReci.brojReci("Danas je lep dan.Bas je lep dan, lep", "lep");
        String maxRec = BrojReci.maxRec("lep lep dan");
        String minRec = BrojReci.minRec("lep lep dan");
        
        System.out.println("Ukupan broj reci lep "+brojReciLep);
        System.out.println("Ukupan broj unete reci je "+brojReci);
        System.out.println("Rec koja se najise pojavljuje u tekstu je "+maxRec);
        System.out.println("Rec koja se najmanje pojavljuje u tekstu je "+minRec);
    }
    
}
