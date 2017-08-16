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
public class Dobavljac {
    public void izvrsiIsporuku(SluzbaNabavke n, int kolicina){
        n.dodajRobu(kolicina);
    }
}
