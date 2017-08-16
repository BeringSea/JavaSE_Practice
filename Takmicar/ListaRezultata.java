/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Takmicar;

import java.util.LinkedList;

/**
 *
 * @author David
 */
public class ListaRezultata {
    private LinkedList<Takmicar> takmicari;
    
    public ListaRezultata(){
        takmicari = new LinkedList<Takmicar>();
    }
    public void unesiTakmicara(Takmicar takmicar){
        if(takmicar != null && !takmicari.contains(takmicar)){
            if(takmicar.getVreme() == 0){
                    takmicari.addLast(takmicar);
                }
            else{
                for (int i = 0; i < takmicari.size(); i++) {
                    if(takmicari.get(i).getVreme() > takmicar.getVreme() || takmicari.get(i).getVreme()==0){
                        takmicari.add(i, takmicar);
                        break;
                    }
                }
            }
            if(!takmicari.contains(takmicar)){
                takmicari.addFirst(takmicar);
            }
        }
        else{
            System.out.println("Greska");
        }
    }
    public void ispisi(){
        for (int i = 0; i < takmicari.size(); i++) {
            System.out.println("Br.: "+(i+1)+" Zemlja: "+takmicari.get(i).getZemlja()+" Ime i prezime: "+takmicari.get(i).getImePrezime()+" Vreme: "+takmicari.get(i).getVreme());
        }
    }
    public void ispisiFinaliste(){
        int max = 8;
        if(max > takmicari.size()){
            max = takmicari.size();
        }
        for (int i = 0; i < max; i++) {
            if(takmicari.get(i).getVreme()!=0){
                System.out.println("Br.: "+(i+1)+" Zemlja: "+takmicari.get(i).getZemlja()+" Ime i prezime: "+takmicari.get(i).getImePrezime()+" Vreme: "+takmicari.get(i).getVreme());
            }
        }
    }
    public void ispisiReprezentativce(String zemlja){
        for (int i = 0; i < takmicari.size(); i++) {
            if(takmicari.get(i).getZemlja().equals(zemlja)){
                System.out.println("Br.: "+(i+1)+" Zemlja: "+takmicari.get(i).getZemlja()+" Ime i prezime: "+takmicari.get(i).getImePrezime()+" Vreme: "+takmicari.get(i).getVreme());
            }
        }
    }
    public boolean daLiJeOborenRekord(double vreme){
        for (int i = 0; i < takmicari.size(); i++) {
            if(vreme < takmicari.get(i).getVreme() && takmicari.get(i).getVreme()!=0){
                System.out.println("Rekord je oboren");
                return true;
            }
        }
        System.out.println("Rekord nije oboren");
        return false;
    }
}
