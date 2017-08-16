/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UcitavanjeSaTastature;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author David
 */
public class UcitavanjeSaTastature {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int brojac = 0;
    public static void ucitajIIspisiBrojRecenica(){
        try {
            System.out.println("Unesite tekst: ");
            String s = br.readLine();
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '.')
                    brojac++;
            }
            System.out.println("Broj recenica u tekstu je: "+brojac);
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public static void brojReciURecenici(){
        try {
            System.out.println("Unesite neki tekst: ");
            String s = br.readLine();
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == ' ')
                   brojac++; 
            }
            System.out.println("Broj reci u recenici je: "+brojac);
        } catch (IOException e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public static void brojPojavljivanjaReciSneg(){
        try {
            System.out.println("Unesite neki tekst: ");
            String s = br.readLine();
            String[] reci = s.split(" ");
            for (int i = 0; i < reci.length; i++) {
                if(reci[i].equalsIgnoreCase("sneg") || reci[i].equalsIgnoreCase("sneg.")){
                    brojac++;
                }
            }
            System.out.println("Broj pojavljivanja reci sneg je: "+brojac);
            
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public static void metriUKilometre(){
        try {
            System.out.println("Unesite neki broj: ");
            Double unetiBrojMetri = Double.parseDouble(br.readLine());
            double kilometri = unetiBrojMetri / 1000;
            System.out.println("Broj metara u kilometrima je: "+kilometri);
            
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public static void sumaRealnihBrojeva(){
        boolean kraj = true;
        double suma = 0;
        while(kraj){
            try {
                System.out.print("Unesite realan broj: ");
                String s = br.readLine();
                if(s.equals("kraj")){
                    kraj=false;
                }
                else{
                    suma+=Double.parseDouble(s);
                }
                
            } catch (Exception e) {
                System.out.println("Greska: "+e.getMessage());
            }
        }
        System.out.println("Suma realnih brojeva je: "+suma);
    }
    public static void faktorijelCelihBrojeva(){
        try {
            System.out.print("Unesite ceo broj: ");
            String s = br.readLine();
            int broj = Integer.parseInt(s);
            int faktorijel = 1;
            for (int i = 1; i < broj; i++) {
                faktorijel*=i;
            }
            System.out.println("Faktorijel je "+faktorijel);
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public static void proizvodCelihBrojeva(){
        boolean kraj = true;
        int proizvod = 1;
        System.out.print("Unesite cele brojeve: ");
        while (kraj) {            
            try {
                String s = br.readLine();
                if(s.equalsIgnoreCase("kraj")){
                    kraj = false;
                }
                else{
                    String[] brojevi = s.split(" ");
                    for (int i = 0; i < brojevi.length; i++) {
                        proizvod*= Integer.parseInt(brojevi[i]);
                    }
                }
            } catch (Exception e) {
                System.out.println("Greska: "+e.getMessage());
            }
        }
        System.out.println("Proizvod celih brojeva je "+proizvod);
    }
}
