/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Osoba;

/**
 *
 * @author David
 */
public class Osoba {
    private String ime = "N";
    private String prezime = "N";
    private String jbmg;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        if(ime != null){
            this.ime = ime;
        }
        else{
            System.out.println("Greska");
        }
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        if(prezime != null){
            this.prezime = prezime;
        }
        else{
            System.out.println("Greska");
        }
    }

    public String getJbmg() {
        return jbmg;
    }

    public void setJbmg(String jbmg) {
        if(jbmg != null){
            this.jbmg = jbmg;
        }
         else{
            System.out.println("Greska");
        }
    }

    @Override
    public String toString() {
        return "Ime: "+this.ime+" Prezime: "+this.prezime+" JMBG: "+this.jbmg+"\n";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Osoba){
            Osoba o = (Osoba)obj;
            if(this.ime.equals(o.getIme()) && this.prezime.equals(o.getPrezime())
                    && this.jbmg.equals(o.getJbmg())){
                System.out.println("Osobe su identicne ...");
                return true;
            }
            else{
                System.out.println("Osobes u razlicite ...");
                return false;
            }
        }
        else{
            System.out.println("Greska");
            return false;
        }
    }
}
