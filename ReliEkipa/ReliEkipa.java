/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReliEkipa;

/**
 *
 * @author David
 */
public class ReliEkipa {
    private String imeEkipe;
    private int brojPoena;

    public String getImeEkipe() {
        return imeEkipe;
    }

    public void setImeEkipe(String imeEkipe) {
        if(imeEkipe != null){
            this.imeEkipe = imeEkipe;
        }
        else{
            System.out.println("Greska");
        }
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        if(brojPoena >= 0){
            this.brojPoena = brojPoena;
        }
        else{
            System.out.println("Greska");
        }
    }

    @Override
    public String toString() {
        return "Ime ekipe je: "+this.imeEkipe + "Broj osvojenih poena je: "+this.brojPoena;
    }

    @Override
    public boolean equals(Object obj) {
       if(obj instanceof ReliEkipa){
           ReliEkipa reliEkipa = (ReliEkipa)obj;
           if(this.imeEkipe.equals(reliEkipa.getImeEkipe()))
               return true;
           else
               return false;
       }
       return false;
    }
}
