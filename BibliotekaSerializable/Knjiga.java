/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BibliotekaSerializable;

import java.io.Serializable;

/**
 *
 * @author David
 */
public class Knjiga implements Serializable{
    private String naslov;
    private String ISBN;
    private String autor;

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        if(naslov==null)
            throw new RuntimeException("Morate uneti naslov knjige");
        this.naslov = naslov;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        if(ISBN == null)
            throw new RuntimeException("Morate uneti ISBN");
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if(autor==null)
            throw new RuntimeException("Morate uneti autora");
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Naslov: "+this.naslov + " ISBN: "+this.ISBN+" Autor: "+this.autor;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Knjiga){
            Knjiga knjiga = (Knjiga)obj;
            if(ISBN.equals(knjiga.getISBN())){
                return true;
            }
        }
        return false;
    }
}
