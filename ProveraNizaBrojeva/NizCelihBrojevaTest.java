/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProveraNizaBrojeva;

/**
 *
 * @author David
 */
public class NizCelihBrojevaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NizCelihBrojeva ncb = new NizCelihBrojeva();
        ncb.dodajUNiz(5);
        ncb.dodajUNiz(8);
        ncb.dodajUNiz(9);
        ncb.dodajUNiz(4);
        //ncb.prviElement();
        //ncb.ispisiElement(6);
        ncb.sviElementiNiza();
        System.out.println("Zbir svih elemenata niza je " + ncb.sumaElemenataNiza());
        System.out.println("Najmanji element u nizu je " + ncb.najmanjiUNizu());
        System.out.println("Najveci elemet u nizu je " + ncb.najveciUNizu());
        
    }
    
}
