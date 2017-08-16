/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BrojacReci;

/**
 *
 * @author David
 */
public class BrojReci {
    public static int brojReciUTekstu(String tekst){
        String[] reci = tekst.split(" ");
        return reci.length;
    }
    public static int brojReciLep(String tekst){
        String[] reci = tekst.split(" ");
        int brojac = 0;
        for (int i = 0; i < reci.length; i++) {
            if(reci[i].equals("lep")){
                brojac++;
            }
        }
        return brojac;
    }
    public static int brojReci(String tekst, String rec){
        String[] reci = tekst.split(" ");
        int brojac = 0;
        for (int i = 0; i < reci.length; i++) {
            if((reci[i].equalsIgnoreCase(rec)) || (reci[i].equalsIgnoreCase(rec+"."))){
                brojac++;
            }
        }
        return brojac;
    }
    public static String maxRec(String tekst){
        String[] reci = tekst.split(" ");
        String maxRec = reci[0];
        int maxBrojPonavljanja = 0;
        for (int i = 0; i < reci.length; i++) {
            if(brojReci(tekst,reci[i]) > maxBrojPonavljanja){
                maxBrojPonavljanja = brojReci(tekst,reci[i]);
                maxRec = reci[i];
            }
        }
        return maxRec;
    }
    public static String minRec(String tekst){
        String[] reci = tekst.split(" ");
        String minRec = reci[0];
        int minBrojPonavljanje = reci.length + 1;
        for (int i = 0; i < reci.length; i++) {
            if(brojReci(tekst,reci[i]) < minBrojPonavljanje){
                minBrojPonavljanje = brojReci(tekst,reci[i]);
                minRec = reci[i];
            }
        }
        return minRec;
    }
}
