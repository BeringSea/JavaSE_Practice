/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Djak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;

/**
 *
 * @author David
 */
public class Odeljenje {
    LinkedList<Djak> djaci = new LinkedList<Djak>();
    public void ucitajIzFajla(){
       boolean kraj = false;
        String s = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("djaci.txt"));
            while (!kraj) {                
                String pom = br.readLine();
                if(pom==null)
                    kraj=true;
                else{
                    Djak dj = new Djak();
                    String ime = pom.substring(0, pom.indexOf(' '));
                    String prezime = pom.substring(pom.indexOf(' ')+1,pom.lastIndexOf(' '));
                    int ocena = Integer.parseInt(pom.substring(pom.lastIndexOf(' ')+1));
                    dj.setIme(ime);
                    dj.setPrezime(prezime);
                    dj.setOcena(ocena);
                    if(!djaci.contains(dj))
                        djaci.add(dj);
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }   
    }
    public void upisiOdlicne(){
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("odlicniDjaci.txt")));
            for (int i = 0; i < djaci.size(); i++) {
                if(djaci.get(i).getOcena() == 5){
                    pw.println(djaci.get(i));
                }
            }
            pw.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public void upisiLose(){
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("losiDjaci.txt")));
            for (int i = 0; i < djaci.size(); i++) {
                if(djaci.get(i).getOcena() == 1 || djaci.get(i).getOcena()==2){
                    pw.println(djaci.get(i));
                }
            }
            pw.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public void ispisiDjake(){
        for (int i = 0; i < djaci.size(); i++) {
            System.out.println(djaci.get(i));
        }
    }
}
