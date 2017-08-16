/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BibliotekaSerializable;

/**
 *
 * @author David
 */
public class BibliotekaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Biblioteka b = new Biblioteka();
        Knjiga k1 = new Knjiga();
        Knjiga k2 = new Knjiga();
        Knjiga k3 = new Knjiga();
        
        k1.setNaslov("n1");
        k1.setISBN("1");
        k1.setAutor("a1");
        
        k2.setNaslov("n2");
        k2.setISBN("2");
        k2.setAutor("a2");
        
        k3.setNaslov("n3");
        k3.setISBN("3");
        k3.setAutor("a3");
        
//        b.unesiKnjigu();
//        b.unesiKnjigu();
//        b.unesiKnjigu();
        b.unesiKnjiguKlasa(k1);
        b.unesiKnjiguKlasa(k2);
        b.unesiKnjiguKlasa(k3);
        b.upisiKnjige();
        b.iscitajIPopuniBiblioteku();
        b.ispisiIzListe();
    }
    
}
