/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSerializable;

import java.io.Serializable;

/**
 *
 * @author David
 */
public class Student implements Serializable{
    private String imePrezime;
    private int brojPoena;

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        if(imePrezime == null)
            throw new RuntimeException("Morate uneti ime i prezime studenta");
        this.imePrezime = imePrezime;
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        if(brojPoena < 0 || brojPoena > 100)
            throw new RuntimeException("Broj poena nije u odgovarajucem opsegu");
        this.brojPoena = brojPoena;
    }

    @Override
    public String toString() {
        return "Ime i prezime:  "+this.imePrezime+" Broj poena: "+this.brojPoena;
    }
}
