/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteka;

/**
 *
 * @author David
 */
public class Knjiga {
    private String naslov;
    private String ISBN;
    private String autor;

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        if(naslov == null)
            throw new RuntimeException("Greska");
        this.naslov = naslov;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        if(ISBN == null)
            throw new RuntimeException("Greska");
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if(autor == null)
            throw new RuntimeException("Greska");
        this.autor = autor;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Knjiga){
            Knjiga knjiga = (Knjiga)obj;
            if(this.ISBN.equals(knjiga.getISBN()))
                return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Naslov: "+this.naslov+" ISBN: "+this.ISBN+" Autor: "+this.autor;
    }
}
