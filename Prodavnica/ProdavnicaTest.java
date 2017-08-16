/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prodavnica;

/**
 *
 * @author David
 */
public class ProdavnicaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prodavnica prodavnica = new Prodavnica();
        Skladiste skladiste = new Skladiste();
        Dobavljac dobavljac = new Dobavljac();
        
        prodavnica.ispisi();
        dobavljac.izvrsiIsporuku(prodavnica, 100);
        prodavnica.ispisi();
        dobavljac.izvrsiIsporuku(skladiste, 500);
        skladiste.stanjeSkladiste();
    }
    
}
