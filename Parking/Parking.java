/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parking;

import java.util.Spliterators;

/**
 *
 * @author David
 */
public class Parking {
    private ParkingMesto[] mesta;
    
    public Parking(int brojParkingMesta){
        if(brojParkingMesta > 0){
            mesta = new ParkingMesto[brojParkingMesta];
            
        }
        else{
            mesta = new ParkingMesto[40];
            System.out.println("Greska");
        }
        for (int i = 0; i < mesta.length; i++) {
                mesta[i] = new ParkingMesto();
                mesta[i].setSlobodno(true);
            }
    }
    public void ispisiPrvo(){
        if(mesta[0].isSlobodno())
            System.out.println("Parking mesto je slobodno...");
        else
            System.out.println("Reg. broj kola na prvom parking mestu je "+mesta[0].getRegistarskiBroj());
    }
    public void ispisiPoslednje(){
        if(mesta[mesta.length-1].isSlobodno())
            System.out.println("Parking mesto je slobodno");
        else
            System.out.println("Reg. broj kola na poslednjem parking mestu je "+mesta[mesta.length-1].getRegistarskiBroj());
    }
    public boolean imaSlobodnih(){
        for (int i = 0; i < mesta.length; i++) {
            if(mesta[i].isSlobodno())
                return true;
        }
        return false;
    }
    public int brojSlobodnih(){
        int brojac = 0;
        for (int i = 0; i < mesta.length; i++) {
            if(mesta[i].isSlobodno()){
                brojac++;
            }
        }
        return brojac;
    }
    public boolean daLiJeNaParkingu(String regBr){
        for (int i = 0; i < mesta.length; i++) {
            if(mesta[i].isSlobodno()){
                if(mesta[i].getRegistarskiBroj().equals(regBr))
                    return true;
            }
        }
        return
                false;
    }
    public void uvediNaParking(String regBroj){
        if(imaSlobodnih()){
            for (int i = 0; i < mesta.length; i++) {
                if(mesta[i].isSlobodno()){
                    mesta[i].setSlobodno(false);
                    mesta[i].setRegistarskiBroj(regBroj);
                    break;
                }
            }
        }
        else{
            System.out.println("Na parkingu nema slobodnih mesta ...");
        }
    }
    public void izvediSaParkingMesta(String regBroj){
        if(daLiJeNaParkingu(regBroj)){
            for (int i = 0; i < mesta.length; i++) {
                if(!mesta[i].isSlobodno() && mesta[i].getRegistarskiBroj().equals(regBroj)){
                    mesta[i].setSlobodno(true);
                    mesta[i].setRegistarskiBroj(null);
                    break;
                }
            }
        }
        else{
            System.out.println("To vozilo se ne nalazi na parkingu ...");
        }
    }
    public void ispisi(){
        for (int i = 0; i < mesta.length; i++) {
            if(!mesta[i].isSlobodno()){
                System.out.println("Mesto br: "+i+" Reg. br. vozila "+mesta[i].getRegistarskiBroj());
            }
        }
    }
    public void ispisiBg(){
        for (int i = 0; i < mesta.length; i++) {
            if(!mesta[i].isSlobodno()){
                String bg = mesta[i].getRegistarskiBroj().substring(0, 2);
                if(bg.equals("BG")){
                    System.out.print("Broj parking mesta "+i+" Reg. br. "+mesta[i].getRegistarskiBroj());
                }
            }
        }
    }
}
