/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DnkLanac;

/**
 *
 * @author David
 */
public class DnkLanac {
    private char[] karika;
    private int brojac;
    
    public DnkLanac(){}
    
    public DnkLanac(int broj){
        if(broj <=0){
            karika = new char[256];
            brojac=0;
        }
        else{
            karika = new char[broj];
            brojac = 0;
        }
    }
    public void dodajKariku(char karika){
        if((karika == 'A') || (karika=='C') || (karika=='G') || (karika=='T') && (brojac < this.karika.length)){
            this.karika[brojac] = karika;
            brojac++;
        }
        else{
            System.err.println("Greska pri unosu nove karike!");
        }
    }
    public int brojAKarika(){
        int broj=0;
        for(int i=0; i<brojac; i++){
            if(karika[i] == 'A'){
                broj++;
            }
        }
        return broj;
    }
    public int trenutnaDuzina(){
        return brojac;
    }
    public int maksimalniKapacitet(){
        return this.karika.length;
    }
    public int nepopunjenBrojKarika(){
        return this.karika.length - brojac;
    }
    public void ispisKarikaULancu(){
        for (int i = 0; i < brojac; i++) {
            System.out.print(karika[i]);
        }
        System.out.println();
    }
    public void ispisKarikaULancuObrnuto(){
        for (int i = brojac-1; i >=0; i--) {
            System.out.print(karika[i]);
        }
        System.out.println();
    }
}
