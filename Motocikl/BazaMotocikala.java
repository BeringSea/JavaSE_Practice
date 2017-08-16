/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Motocikl;

import java.util.LinkedList;

/**
 *
 * @author David
 */
public class BazaMotocikala {
    private LinkedList<Motocikl> motocikli;
    
    public BazaMotocikala(){
        motocikli = new LinkedList<Motocikl>();
    }
    public boolean daLiJeUBazi(Motocikl motocikl){
        if(motocikli.contains(motocikl)){
            return true;
        }
        return false;
    }
    public void unesiUBazu(Motocikl motocikl){
        if(motocikl != null){
            motocikli.add(motocikl);
        }
        else{
            System.out.println("Greska");
        }
    }
    public void izbaciIzBaze(Motocikl motocikl){
        if(motocikl!=null && motocikli.contains(motocikl)){
            motocikli.remove(motocikl);
        }
        else{
            System.out.println("Greska");
        }
    }
    public void ispisi(){
        for (int i = 0; i < motocikli.size(); i++) {
            System.out.println(motocikli.get(i));
        }
    }
    public void ispisiKawasaki(){
        for (int i = 0; i < motocikli.size(); i++) {
            String kawasaki = motocikli.get(i).getMarka();
            if(kawasaki.equals("Kawasaki")){
                System.out.println(motocikli.get(i));
            }
        }
    }
    public int maxKubikaza(){
        int max = 0;
        for (int i = 0; i < motocikli.size(); i++) {
            if(motocikli.get(i).getKubukaza() > max){
                max = motocikli.get(i).getKubukaza();
            }
        }
        return max;
    }
    public double prosecnaKubikaza(){
        double suma = 0;
        for (int i = 0; i < motocikli.size(); i++) {
            suma+=motocikli.get(i).getKubukaza();
        }
        return suma / motocikli.size();
    }
    public void ispisiNajveci(){
        int maxK = maxKubikaza();
        for (int i = 0; i < motocikli.size(); i++) {
            if(motocikli.get(i).getKubukaza() == maxK){
                System.out.println(motocikli.get(i));
                break;
            }
        }
    }
}
