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
public class Student {
    private String imePrezime;
    private double brojPoena;

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        if(imePrezime == null)
            throw new RuntimeException("Morate uneti ime i prezime");
        this.imePrezime = imePrezime;
    }

    public double getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(double brojPoena) {
        if(brojPoena < 0 || brojPoena > 100)
            throw new RuntimeException("Broj poena je van dozvoljenih granica");
        this.brojPoena = brojPoena;
    }

    @Override
    public String toString() {
        return "Ime i prezime: "+this.imePrezime + " Broj poena: "+this.brojPoena;
    }
    
}
