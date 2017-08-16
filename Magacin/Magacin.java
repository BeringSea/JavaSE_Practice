/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Magacin;

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
public class Magacin {
    private LinkedList<Proizvod> proizvodi;
    public Magacin(){
        proizvodi = new LinkedList<Proizvod>();
    }
    public void ucitajProizvode(){
        try {
            boolean kraj = false;
            BufferedReader br = new BufferedReader(new FileReader("proizvodi.txt"));
            while (!kraj) {
                String pom = br.readLine();
                if(pom==null)
                    kraj=true;
                else{
                    Proizvod proizvod = new Proizvod();
                    int sifra = Integer.parseInt(pom.substring(0,pom.indexOf(" ")));
                    String naziv = pom.substring(pom.indexOf(" ")+1,pom.lastIndexOf(" "));
                    int kolicina = Integer.parseInt(pom.substring(pom.lastIndexOf(" ")+1));
                    proizvod.setSifra(sifra);
                    proizvod.setNaziv(naziv);
                    proizvod.setKolicina(kolicina);
                    if(!proizvodi.contains(proizvod))
                        proizvodi.add(proizvod);
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public void sastaviListu(){
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("listaNabavki.txt")));
            pw.println("Proizvodi koje je potrebno nabaviti: ");
            for (int i = 0; i < proizvodi.size(); i++) {
                if(proizvodi.get(i).getKolicina()<5){
                    pw.println((i+1)+" "+proizvodi.get(i));
                }
            }
            pw.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public void dopuna(){
        try {
            boolean kraj = false;
            BufferedReader br = new BufferedReader(new FileReader("dopuna.txt"));
            while (!kraj) {
                String pom = br.readLine();
                if(pom==null)
                    kraj=true;
                else{
                    Proizvod proizvod = new Proizvod();
                    int sifra = Integer.parseInt(pom.substring(0,pom.indexOf(" ")));
                    String naziv = pom.substring(pom.indexOf(" ")+1,pom.lastIndexOf(" "));
                    int kolicina = Integer.parseInt(pom.substring(pom.lastIndexOf(" ")+1));
                    proizvod.setSifra(sifra);
                    proizvod.setNaziv(naziv);
                    proizvod.setKolicina(kolicina);
                    if(!proizvodi.contains(proizvod))
                        proizvodi.add(proizvod);
                    else{
                        Proizvod stariProizvod = proizvodi.get(proizvodi.indexOf(proizvod));
                        stariProizvod.setKolicina(stariProizvod.getKolicina()+proizvod.getKolicina());
                    }
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public void magacinIspis(){
        for (int i = 0; i < proizvodi.size(); i++) {
            System.out.println(proizvodi.get(i));
        }
    }
}
