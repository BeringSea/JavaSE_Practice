/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Djak;

/**
 *
 * @author David
 */
public class Djak {
    private String ime;
    private String prezime;
    private int ocena;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        if(ime == null)
            throw new RuntimeException("Morate uneti ime.");
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        if(prezime == null)
            throw new RuntimeException("Morate uneti prezime");
        this.prezime = prezime;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        if(ocena < 1 || ocena > 5)
            throw new RuntimeException("Ocena je u nedozvoljenom opsegu");
        this.ocena = ocena;
    }

    @Override
    public String toString() {
        return this.ime+" "+this.prezime+" "+this.ocena;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Djak){
            Djak djak = (Djak)obj;
            if(this.ime.equals(djak.getIme()) && this.prezime.equals(djak.getPrezime()))
                return true;
        }
        return false;
    }
}
