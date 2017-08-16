/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOAnalizatorTeksta;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author David
 */
public class IOAnalizatorTeksta {
    public static String ucitaj(String fajl) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader(fajl));
        String s = "";
        boolean kraj = false;
        while (!kraj) {            
            String pom = br.readLine();
            if(pom==null){
                kraj = true;
            }
            else{
                s+=pom+" ";
            }
        }
        br.close();
        return  s;
    }
    public static void odvojenaSlova(String fajl){
        if(fajl==null)
            throw new RuntimeException("Morate uneti ime fajla.");
        try {
            String s = ucitaj(fajl);
            String[] reci = s.split(" ");
            for (int i = 0; i < reci.length; i++) {
                for (int j = 0; j < reci[i].length(); j++) {
                    System.out.print(reci[i].charAt(j)+" ");
                }
                System.out.println();
            }
            
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public static void ucitajDesetReci(String fajl){
        try {
            if(fajl == null)
                throw new RuntimeException("Morate uneti ime fajla");
            String s = ucitaj(fajl);
            String[] reci = s.split(" ");
            for (int i = 0; i < reci.length; i++) {
                    if((i+1)%10==0){
                        System.out.println(reci[i]);
                    }
                    else{
                        System.out.print(reci[i]+" ");
                    }
            }
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public static void reciOdPetSlova(String fajl){
        try {
            if(fajl == null)
                throw new RuntimeException("Morate uneti ime fajla.");
            String s = ucitaj(fajl);
            String[] reci = s.split(" ");
            for (int i = 0; i < reci.length; i++) {
                if(reci[i].length() >= 5){
                    System.out.println(reci[i] + " -> " + reci[i].substring(0,5));
                }
                else{
                    char poslednjeSlovo = reci[i].charAt(reci[i].length()-1);
                    String pom  =  reci[i]
                            +poslednjeSlovo
                            +poslednjeSlovo
                            +poslednjeSlovo
                            +poslednjeSlovo
                            +poslednjeSlovo;
                    System.out.println(reci[i] + " -> "+pom.substring(0,5));
                }
            }
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public static int brojPonavljanjaReci(String tekst, String rec){
        if(tekst == null || rec == null)
            throw new RuntimeException("Morate uneti tekst i rec.");
        String[] reci = tekst.split(" ");
        int brojac = 0;
        for (int i = 0; i < reci.length; i++) {
            if(reci[i].equalsIgnoreCase(rec) || reci[i].equalsIgnoreCase(rec+".")){
                brojac++;
            }
        }
        return brojac;
    }
    public static void izFajlaUFajl(String fajl){
        try {
            if(fajl == null)
                throw new RuntimeException("Morate uneti ime fajla");
            String s = ucitaj(fajl);
            String[] reci = s.split(" ");
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("tekst1.txt")));
            for (int i = 0; i < reci.length; i++) {
                if(brojPonavljanjaReci(s, reci[i]) > 1){
                    pw.println(reci[i]);
                }
            }
            pw.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public static void brojNajkracaNajduzaRec(){
        try {
            String s = ucitaj("tekst.txt");
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("tekst2.txt")));
            String[] reci = s.split(" ");
            
            pw.println("Broj reci je: "+reci.length+"\n");
            
            String maxRec=reci[0];
            String minRec=reci[0];
            
            for (int i = 0; i < reci.length; i++) {
                if(reci[i].length() > maxRec.length()){
                    maxRec = reci[i];
                }
                if(reci[i].length() < minRec.length()){
                    minRec = reci[i];
                }
            }
            pw.println("Najduza rec u tekstu je: "+maxRec);
            pw.println("Najkraca rec u tekstu je: "+minRec);
            pw.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
}
