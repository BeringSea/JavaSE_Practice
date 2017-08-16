/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentData;

/**
 *
 * @author David
 */
public class RezultatiKolokvijumaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RezultatiKolokvijuma rez = new RezultatiKolokvijuma();
        rez.unesiStudenta("David Mojicevic", 100);
        rez.unesiStudenta("Jovana Sovilj", 50.55);
        rez.unesiStudenta("Marko Pavlovic", 33.5);
        
        rez.upisiUFajl();
        rez.ucitajPodatke();
        System.out.println("Prosecan broj poena studenata "+rez.prosek());
        rez.najboljiStudent();
    }
}
