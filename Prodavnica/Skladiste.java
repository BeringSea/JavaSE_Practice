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
public class Skladiste implements SluzbaNabavke{
    private int stanjeUSkladistu = 1000;
    
    @Override
    public void dodajRobu(int brojKomada) {
        if(brojKomada > 0){
            stanjeUSkladistu += brojKomada;
        }
        else{
            System.out.println("Greska");
        }
    }
    public void skiniSaStanja(int kolicina){
        if(kolicina > 0 && kolicina <= stanjeUSkladistu)
        {
            stanjeUSkladistu-=kolicina;
        }
        else{
            System.out.println("Greska");
        }
    }
    public void stanjeSkladiste(){
        System.out.println("Stanje u skladistu je "+stanjeUSkladistu+" komada proizvoda...");
    }
}
