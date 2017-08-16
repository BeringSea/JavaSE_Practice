/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MuzickiUredjaj;

/**
 *
 * @author David
 */
public class MuzickiStub extends MuzickiUredjaj implements RadioKomponenta,CdKomponenta{

    private double frekvencija = 87.5;
    private int brojPesme;
    private boolean ukljucenRadio;
    private boolean ukljucenCd;
    
    @Override
    public void ispisi() {
        if(ukljucen){
            System.out.println("Muzicki uredjaj je ukljucen ...");
            System.out.println("Jacina zvuka je "+jacinaTona);
            if(ukljucenRadio){
                System.out.println("Frekvencija radio stanice je "+frekvencija);
            }
            if(ukljucenCd){
                System.out.println("Broj pesme na CD - u je "+brojPesme);
            }
        }
        else{
            System.out.println("Muzicki stub je iskljucen ...");
        }
    }

    @Override
    public void promeniStanicu(double radioFrekvencija) {
        ukljucenRadio = true;
        ukljucenCd = false;
        if(radioFrekvencija >= 87.5 && radioFrekvencija <= 108.0){
            frekvencija = radioFrekvencija;
        }
        else{
            this.frekvencija = this.frekvencija;
        }
    }
   
    @Override
    public void pustiPesmu(int brojPesme) {
        ukljucenRadio = false;
        ukljucenCd = true;
        if(brojPesme > 0 && brojPesme<=21){
            this.brojPesme = brojPesme;
        }
        else{
            this.brojPesme = 1;
        }
    }
}
