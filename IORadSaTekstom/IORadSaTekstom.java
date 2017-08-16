/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IORadSaTekstom;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author David
 */
public class IORadSaTekstom {
    public static void procitajIzFajla(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("tekst.txt"));
            boolean kraj = false;
            String s = "";
            while (!kraj) {                
                String pom = br.readLine();
                if(pom==null)
                    kraj = true;
                else
                    s+=pom;
            }
            System.out.println(s);
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public static void procitajIzFajla(String fajl){
        try {
            if(fajl == null) throw new RuntimeException("Morate uneti ime fajla!");
            BufferedReader br = new BufferedReader(new FileReader(fajl));
            boolean kraj = false;
            String s = "";
            while (!kraj) {                
                String pom = br.readLine();
                if(pom == null)
                    kraj = true;
                else
                    s+=pom;
            }
            System.out.println(s);
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public static void ispisiBrojReci(String imeFajla){
        try {
            if(imeFajla == null) throw new RuntimeException("Morate uneti ime fajla!");
            BufferedReader br = new BufferedReader(new FileReader(imeFajla));
            String s = "";
            boolean kraj = false;
            while (!kraj) {                
                String pom = br.readLine();
                if(pom==null)
                    kraj = true;
                else
                    s+=pom;
            }
            String[] niz = s.split(" ");
            System.out.println("Broj reci u tekstu je: "+niz.length);
            
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public static boolean daLiPostojiRec(String fajl,String rec){
        try {
            if(rec == null || fajl == null)
                throw new RuntimeException("Morate uneti neku rec!");
            BufferedReader br = new BufferedReader(new FileReader(fajl));
            boolean kraj = false;
            String s = "";
            while (!kraj) {                
                String pom = br.readLine();
                if(pom==null)
                    kraj=true;
                else
                    s+=pom+" ";
            }
            br.close();
            String[] reci = s.split(" ");
            for (int i = 0; i < reci.length; i++) {
                if(reci[i].equalsIgnoreCase(rec) || reci[i].equalsIgnoreCase(rec+"."))
                    return true;
            }
            return false;
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
            return false;
        }
    }
    public static void brojRecenicaUTekstu(String fajl){
        try {
            BufferedReader br = new BufferedReader(new FileReader(fajl));
            boolean kraj = false;
            String s = "";
            int brojac = 0;
            while (!kraj) {                
                String pom = br.readLine();
                if(pom==null)
                    kraj=true;
                else
                    s+=pom;
            }
            br.close();
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='.' || s.charAt(i)=='!' || s.charAt(i)=='?'){
                    brojac++;
                }
            }
            System.out.println("Broj recina u tekstu je "+brojac);
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public static void upisiUFajl(String tekst){
        try {
            if(tekst==null)
                throw new RuntimeException("Morate uneti neki tekst");
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("tekst1.txt")));
            pw.println(tekst);
            pw.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public static void upisiViseOd5Slova(String tekst){
        try {
            if(tekst==null)
                throw new RuntimeException("Morate uneti neki tekst");
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("tekst2.txt")));
            String[] niz = tekst.split(" ");
            for (int i = 0; i < niz.length; i++) {
                if(niz[i].length()>5){
                    pw.print(niz[i] + " ");
                }
                else{
                System.out.println("Reci koje se unose moraju imati vise od 5 slova");
                }
            }
            pw.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public static void upisReciSaVelikimA(String tekst){
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("tekst3.txt")));
            String[] niz = tekst.split(" ");
            for (int i = 0; i < niz.length; i++) {
                if(niz[i].charAt(0)=='A'){
                    pw.print(niz[i]+" ");
                }
            }
            pw.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
}
