/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proizvod;

/**
 *
 * @author David
 */
public class Proizvod {
    private int sifra;
    private String naziv;
    private double cena;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        try {
            if(sifra > 0){
                this.sifra = sifra;
            }
            else
                throw new ProizvodException("Sifra mora biti pozitivan broj veci od nule");
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
        
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        try {
            if(naziv != null){
                this.naziv = naziv;
            }
            else{
                throw new ProizvodException("Morate uneti neki naziv za proizvod");
            }
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        try {
            if(cena > 0){
                this.cena = cena;
            }
            else{
                throw new ProizvodException("Cena mora biti pozitivan broj veci od nule");
            }
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
}
