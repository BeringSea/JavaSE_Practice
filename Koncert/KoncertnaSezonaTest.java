/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koncert;

/**
 *
 * @author David
 */
public class KoncertnaSezonaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KoncertnaSezona ks = new KoncertnaSezona();
        ks.unesi("Beograd", "Metallica");
        ks.unesi("Beograd", "50 Cent");
        ks.unesi("Novi Sad", "Moloko");
        ks.unesi("NIs", "Darkwood dub");
        ks.unesi("Indjija", "Red hot chili peppers");
        ks.unesi("Beograd", "Darkwood dub");
        
        ks.upisiUFajl();
        ks.koncertiB();
        ks.upisIzListe();
        
        ks.GradSaNajviseKoncerata();
        ks.bendSaNajviseKoncerata();
    }
    
}
