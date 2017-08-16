/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Magacin;

/**
 *
 * @author David
 */
public class Proizvod {
    private int sifra;
    private String naziv;
    private int kolicina;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        if(sifra < 0)
            throw new RuntimeException("Sifra nesme biti manja od nule");
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        if(naziv == null)
            throw new RuntimeException("Morate uneti naziv");
        this.naziv = naziv;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        if(kolicina < 0)
            throw new RuntimeException("Kolicina nesme biti manja od nule");
        this.kolicina = kolicina;
    }

    @Override
    public String toString() {
        return this.sifra+" "+this.naziv+" "+this.kolicina; 
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Proizvod){
            Proizvod proizvod = (Proizvod)obj;
            if(this.sifra == proizvod.getSifra())
                return true;
        }
        else
            throw new RuntimeException("Proizvod vec postoji");
        return false;
    }
}
