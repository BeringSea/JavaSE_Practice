/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkingMesto;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author David
 */
public class Parking {
    ParkingMesto[] mesta;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public void inicijalizujMesta(){
        try {
            System.out.println("Unesite broj parking mesta ...");
            int brojMesta = Integer.parseInt(br.readLine());
            if(brojMesta <= 0){
                System.out.println("Doslo je do greske pri unosu broja parking mesta");
                mesta = new ParkingMesto[20];
            }
            else{
                mesta = new ParkingMesto[brojMesta];
            }
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
            mesta = new ParkingMesto[20];
        }
        for (int i = 0; i < mesta.length; i++) {
            mesta[i] = new ParkingMesto();
            mesta[i].setSlobodno(true);
        }
    }
    public void unesiPodatke(){
        if(mesta == null) 
            throw new RuntimeException("Niz parking mesta nije inicijalizovan");
        for (int i = 0; i < mesta.length; i++) {
            try {
                System.out.println("Unesite registarski broj ...");
                String s = br.readLine();
                if(s.equalsIgnoreCase("slobodno")){
                    mesta[i].setRegistarskiBroj(null);
                    mesta[i].setSlobodno(true);
                }
                else{
                    mesta[i].setSlobodno(false);
                    mesta[i].setRegistarskiBroj(s);
                }
            } catch (Exception e) {
                System.out.println("Greska: "+e.getMessage());
            }
        }
    }
    public void ispisiParkingMesta(){
        if(mesta == null)
            throw new RuntimeException("Niz parking mesta nije inicijalizovan");
        for (int i = 0; i < mesta.length; i++) {
            System.out.println("Red. br.: "+(i+1)+" Reg.Br.: "+mesta[i]);
        }
    }
}
