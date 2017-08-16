/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Takmicar;

/**
 *
 * @author David
 */
public class Takmicar {
    private String zemlja;
    private String imePrezime;
    private double vreme;

    public String getZemlja() {
        return zemlja;
    }

    public void setZemlja(String zemlja) {
        if(zemlja != null){
            this.zemlja = zemlja;
        }
        else{
            System.out.println("Greska");
        }
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        if(imePrezime != null){
            this.imePrezime = imePrezime;
        }
        else{
            System.out.println("Greska");
        }
    }

    public double getVreme() {
        return vreme;
    }

    public void setVreme(double vreme) {
        if(vreme >= 0){
            this.vreme = vreme;
        }
        else{
            System.out.println("Greska");
        }
    }

    @Override
    public String toString() {
        if(vreme > 0){
            return "Zemlja: "+this.zemlja+" Ime i prezime: "+this.imePrezime+" Vreme: "+this.vreme;
        }
        else
            return "Zemlja: "+this.zemlja+" Ime i prezime: "+this.imePrezime+" Diskvalifikovan";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Takmicar){
            Takmicar takmicar = (Takmicar)obj;
            if(this.imePrezime.equals(takmicar.getImePrezime())){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}
