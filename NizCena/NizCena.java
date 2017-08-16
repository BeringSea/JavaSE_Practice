/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NizCena;

/**
 *
 * @author David
 */
public class NizCena {
    private double[] nizCena = new double[100];
    private int brojac = 0;
    
    public void dodajCenu(double cena){
        if(cena > 0 && brojac < nizCena.length){
            nizCena[brojac] = cena;
            brojac++;
        }
        else{
            System.err.println("Greska pri unosu nove cene...!");
        }
    }
    public double prosecnaCena(){
        double prosecna = 0;
        if(nizCena != null){
            double suma = 0;
            for (int i = 0; i < brojac; i++) {
                suma+=nizCena[i];
            }
            prosecna = suma/brojac;
        }
        else{
            System.err.println("Niz cena je prazan!");
            return 0;
        }
        return prosecna;
    }
    public double najnizaCena(){
        double najnizaCena=nizCena[0];
        if(nizCena != null){
            for (int i = 0; i < brojac; i++) {
                if(nizCena[i] < najnizaCena){
                    najnizaCena = nizCena[i];
                }
            }
        }
        else{
            System.err.println("Niz cena je prazan!");
            return 0;
        }
        return najnizaCena;
    }
    public double najvisaCena(){
        double najvisaCena = nizCena[0];
        if(nizCena != null){
            for (int i = 0; i < brojac; i++) {
                if(nizCena[i] > najvisaCena){
                    najvisaCena = nizCena[i];
                }
            }
        }
        else{
            System.err.println("Niz cena je prazan!");
            return 0;
        }
        return najvisaCena;
    }
    public double razlikaNajviseINajnize(){
        double najvisaCena = nizCena[0];
        double najnizaCena = nizCena[0];
        double razlikaUCenama = 0;
        if(nizCena != null){
            for (int i = 0; i < brojac; i++) {
                if(nizCena[i] > najvisaCena ){
                    najvisaCena = nizCena[i];
                }
                if(nizCena[i] < najnizaCena){
                    najnizaCena = nizCena[i];
                }
            }
            razlikaUCenama = najvisaCena - najnizaCena;
        }
        else{
             System.err.println("Niz cena je prazan!");
            return 0;
        }
        return razlikaUCenama;
    }
    public void ceneVeceOdZadate(double zadataCena){
        if(nizCena != null){
            for (int i = 0; i < brojac; i++) {
                if(nizCena[i] > zadataCena){
                    System.out.println(nizCena[i]);
                }
            }
        }
        else{
            System.err.println("Niz cena je prazan!");
        }
    }
}
