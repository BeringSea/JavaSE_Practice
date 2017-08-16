/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AvionMesto;

import org.omg.CORBA.CompletionStatusHelper;

/**
 *
 * @author David
 */
public class Avion {
    private MestoUAvionu[] mesta;
    
    public Avion(){
        mesta = new MestoUAvionu[120];
        for (int i = 0; i < 120; i++) {
            mesta[i] = new MestoUAvionu();
        }
    }
    public void uvediPutnika(int brojMesta, String imePrezime, int starost){
        if(!mesta[brojMesta].isSlobodno() || brojMesta < 0 || brojMesta > 119){
            System.out.println("Greska");
        }
        else{
            mesta[brojMesta].setSlobodno(false);
            mesta[brojMesta].setImePrezime(imePrezime);
            mesta[brojMesta].setStarost(starost);
        }
    }
    public void izvediPutnika(int brojMesta){
        for (int i = 0; i < mesta.length; i++) {
            if(mesta[brojMesta].isSlobodno() || brojMesta < 0 || brojMesta > 119){
                System.out.println("Greska");
            }
            else{
                mesta[brojMesta].setSlobodno(true);
                mesta[brojMesta].setImePrezime(null);
                mesta[brojMesta].setStarost(0);
            }
        }
    }
    public boolean daLiJeUAvionu(String imePrezime, int starost){
        for (int i = 0; i < mesta.length; i++) {
            if(mesta[i].getImePrezime().equals(imePrezime) && mesta[i].getStarost()==starost){
                return true;
            }
        }
        return 
            false;
    }
    public double procentualnaZauzetost(){
        int brojacZauzeta = 0;
        for (int i = 0; i < 120; i++) {
            if(!mesta[i].isSlobodno()){
                brojacZauzeta++;
            }
        }
        return (brojacZauzeta*100)/120;
    }
    public boolean daLiImaSlobodnih(){
        for (int i = 0; i < 120; i++) {
            if(!mesta[i].isSlobodno()){
                return true;
            }
        }
        return false;
    }
    public int prosecnaStarost(){
        int sumaStarost = 0;
        int brojZauzetih = 0;
        for (int i = 0; i < 120; i++) {
            if(!mesta[i].isSlobodno()){
                sumaStarost+=mesta[i].getStarost();
                brojZauzetih ++;
            }
        }
        return sumaStarost / brojZauzetih;
    }
    public int najstarijiPutnik(){
        int max = 0;
        for (int i = 0; i < 120; i++) {
            if(!mesta[i].isSlobodno() && mesta[i].getStarost() > max){
                max = mesta[i].getStarost();
            }
        }
        return max;
    }
    public int najmladjiPutnik(){
        int min = 200;
        for (int i = 0; i < 120; i++) {
            if(!mesta[i].isSlobodno() && mesta[i].getStarost() < min){
                min = mesta[i].getStarost();
            }
        }
        return min;
    }
    public void ispis(){
        for (int i = 0; i < 120; i++) {
            if(!mesta[i].isSlobodno()){
                System.out.println("Broj sedista: "+i+" Ime i prezime: "+mesta[i].getImePrezime() + " Godine: "+mesta[i].getStarost());
            }
        }
    }
    public void ispisiJovanovice(){
        for (int i = 0; i < 120; i++) {
            if(!mesta[i].isSlobodno()){
                String imePrezime = mesta[i].getImePrezime();
                String prezime = imePrezime.substring(imePrezime.indexOf(' ')+1);
                if(prezime.equals("Jovanovic")){
                    System.out.println("Broj sedista: "+i+" Ime i prezime: "+mesta[i].getImePrezime());
                }
            }
        }
    }
}
