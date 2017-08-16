/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Autobus;

/**
 *
 * @author David
 */
public class Autobus {
    private boolean[] sedista = new boolean[50];
    
    public Autobus(){
        for (int i = 0; i < sedista.length; i++) {
            sedista[i]=true;
        }
    }
    public void uvodjenjePutnika(int brojSedista){
        if(brojSedista > 0 && brojSedista <= sedista.length){
           if(sedista[brojSedista] == true){
               sedista[brojSedista] = false;
           }
           else{
               System.err.println("Sediste pod brojem "+brojSedista+" je vec zauzeto...");
           }
        }
        else{
            System.err.println("Nespostojeci broj sedista ...");
        }
    }
    public boolean daLiImaSlobodnihSedista(){
        for (int i = 0; i < sedista.length; i++) {
            if(sedista[i] != false)
                return true;
        }
        return false;
    }
    public int brojSlobodnihMesta(){
        int brojSlobodnih = 0;
        for (int i = 0; i < sedista.length; i++) {
            if(sedista[i]==true){
                brojSlobodnih++;
            }
        }
        return brojSlobodnih;
    }
    public int brojZauzetihMesta(){
        int brojZauzetih = 0;
        for (int i = 0; i < sedista.length; i++) {
            if(sedista[i] == false){
                brojZauzetih++;
            }
        }
        return brojZauzetih;
    }
    public void slobodnaZauzetaSedista(){
        for (int i = 0; i < sedista.length; i++) {
            if(sedista[i] == true){
                System.out.println("Slobodna sedista "+i);
            }
            else{
                System.out.println("Zauzeta sedista "+i);
            }
        }
    }
}
