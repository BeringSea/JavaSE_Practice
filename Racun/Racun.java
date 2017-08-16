/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Racun;

/**
 *
 * @author David
 */
public class Racun {
    private int broj;
    private String proizvod;
    private double iznos;

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        if(broj <= 0){
            throw new RacunException("Broj racuna mora biti pozitivan");
        }
        this.broj = broj;
    }

    public String getProizvod() {
        return proizvod;
    }

    public void setProizvod(String proizvod) {
        if(proizvod == null){
            throw new RacunException("Proizovd mora imati ime");
        }
        this.proizvod = proizvod;
    }

    public double getIznos() {
        return iznos;
    }

    public void setIznos(double iznos) {
        if(iznos <= 0){
            throw new RacunException("Iznos mora biti pozitivan");
        }
        this.iznos = iznos;
    }

    @Override
    public String toString() {
        return "Br. racuna: "+this.broj+" Ime proizvoda: "+this.proizvod+" Iznos racuna: "+this.iznos;
    }
}
