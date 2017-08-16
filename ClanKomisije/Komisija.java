/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClanKomisije;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.LinkedList;

/**
 *
 * @author David
 */
public class Komisija {
    private LinkedList<ClanKomisije> clanovi;
    
    public Komisija(){
        this.clanovi = new LinkedList<ClanKomisije>();
    }
    public void unesi(ClanKomisije clan){
        if(!clanovi.contains(clan)){
            clanovi.add(clan);
        }
        else{
            System.out.println("Greska");
        }
    }
    public void sprovediPopis(){
        if(clanovi.size() > 5){
            clanovi.clear();
            System.out.println("Komisija je nevazeca!");
        }
    }
    public void razresiClanaKomisije(ClanKomisije clan){
        clanovi.remove(clan);
    }
    public void ispis(){
        for (int i = 0; i < clanovi.size(); i++) {
            System.out.println(clanovi.get(i));
        }
    }
}
