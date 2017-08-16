/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReliEkipa;

import java.util.LinkedList;

/**
 *
 * @author David
 */
public class ReliEkipaLista {
    private LinkedList<ReliEkipa> ekipe = new LinkedList<ReliEkipa>();
    
    public void unesiEkipu(ReliEkipa ekipa){
        if(ekipa!=null && !ekipe.contains(ekipa)){
            for (int i = 0; i < ekipe.size(); i++) {
                if(ekipe.get(i).getBrojPoena() < ekipa.getBrojPoena()){
                    ekipe.add(i, ekipa);
                    break;
                }
            }
            if(!ekipe.contains(ekipa)){
                ekipe.addLast(ekipa);
            }
        }
        else{
            System.out.println("Greska");
        }
    }
    public void ispisi(){
        for (int i = 0; i < ekipe.size(); i++) {
            System.out.println("Br.: "+(i+1)+" Ime ekipe: "+ekipe.get(i).getImeEkipe()+" Broj poena: "+ekipe.get(i).getBrojPoena());
        }
    }
    public void ispisiObrnuto(){
        for (int i = ekipe.size()-1; i >= 0 ; i--) {
            System.out.println("Br.: "+(i+1)+" Ime ekipe: "+ekipe.get(i).getImeEkipe()+" Broj poena: "+ekipe.get(i).getBrojPoena());
        }
    }
    public void ispisiDesetNajboljih(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Br.: "+(i+1)+" Ime ekipe: "+ekipe.get(i).getImeEkipe()+" Broj poena: "+ekipe.get(i).getBrojPoena());
        }
    }
    public void promeniPoziciju(ReliEkipa ekipa){
        if(ekipa != null && ekipe.contains(ekipa)){
            ekipe.remove(ekipa);
            unesiEkipu(ekipa);
        }
        else{
            System.out.println("Greska");
        }
    }
}
