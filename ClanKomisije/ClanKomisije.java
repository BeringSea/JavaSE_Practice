/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClanKomisije;

/**
 *
 * @author David
 */
public class ClanKomisije {
    private String imePrezime;
    private String funkcija = null;

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        if(imePrezime != null && imePrezime!=""){
            this.imePrezime = imePrezime;
        }
        else{
            System.out.println("Greska");
        }
    }

    public String getFunkcija() {
        return funkcija;
    }

    public void setFunkcija(String funkcija) {
        this.funkcija = funkcija;
    }

    @Override
    public String toString() {
        if(funkcija == null){
            return "Ime i prezime "+this.imePrezime;
        }
        else{
            return "Ime i prezime "+this.imePrezime + " Funkcija: "+this.funkcija;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof ClanKomisije){
            ClanKomisije clanKomisije = (ClanKomisije)obj;
            if(imePrezime.equals(clanKomisije.getImePrezime())){
                return true;
            }
        }
        return 
            false;
    }
}
