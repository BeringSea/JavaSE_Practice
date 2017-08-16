/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NizCelihBrojeva;

/**
 *
 * @author David
 */
public class NizCelihBrojeva {
    
    private int [] niz;
    private int brojac;
    
    public NizCelihBrojeva(int niz){
        this.niz = new int[niz];
        this.brojac = 0;
    }
    public void dodavanjeElemenataUNIz(int broj){
        if(brojac > niz.length){
            System.err.println("Kapacitet niza je prekoracen!");
        }
        else{
            niz[brojac] = broj;
            brojac++;
        }
    }
    public int zbirPrveIPoslednjeVrednosti(){
        if(brojac > 0){
            int rezultat = niz[0] + niz[brojac - 1];
            return rezultat;
        }
        else
            System.err.println("Niz je prazan!");
        return 0;
    }
    public int saberiPozitivne(){
        int s =  0;
        for(int i=0; i<brojac; i++){
            if(niz[i] > 0){
                s+=niz[i];
            }
        }
        return s;
    }
    public int pomnoziNegativne(){
        int proizvod = 0;
        for(int i =0; i<brojac; i++){
            if(niz[i] < 0){
                proizvod = proizvod * niz[i];
            }
        }
        return proizvod;
    }
    public int brojPonavljanja(int broj){
        int ponavljanjeBrojac = 0;
        for(int i=0; i<brojac; i++){
            if(niz[i]==broj){
                ponavljanjeBrojac++;
            }
        }
        return ponavljanjeBrojac;
    }
    public void parniBrojevi(){
        for(int i=0; i<brojac; i++){
            if(niz[i] %2 == 0){
                System.out.println(niz[i] + " ");
            }
        }
    }
    public void deljiviSa5(){
        for(int i=0; i<brojac; i++){
            if(niz[i] %5 == 0){
                System.out.println(niz[i] + " ");
            }
        }
        System.out.println();
    }
    public void ispisiObrnuto(){
        for(int i=brojac - 1; i>=0; i--){
            System.out.print(niz[i] + " ");
        }
        System.out.println();
    }
}
