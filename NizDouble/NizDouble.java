/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NizDouble;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author David
 */
public class NizDouble {
    private double [] niz;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public void inicijalizujNiz(){
        try {
            System.out.println("Unesite broj elementa niza: ");
            int kapacitet = Integer.parseInt(br.readLine());
            if(kapacitet <= 0){
                System.out.println("Greska pri izboru kapaciteta niza");
            }
            else{
                niz = new double[kapacitet];
            }
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public void ucitajElementeNiza(){
        if(niz == null) throw new RuntimeException("Niz nije inicijalizovan");
        for (int i = 0; i < niz.length; i++) {
            try {
                System.out.println("Unesite elemente niza na "+(i+1)+". poziciji");
                double elementi = Double.parseDouble(br.readLine());
                niz[i] = elementi;
            } catch (Exception e) {
                System.out.println("Doslo je do greske pri unosu elementa na "+(i+1)+". poziciji");
            }
        }
    }
    public double sumirajElementeNiza(){
        if(niz == null) throw new RuntimeException("Niz nije inicijalizovan");
        double suma = 0;
        for (int i = 0; i < niz.length; i++) {
            suma+=niz[i];
        }
        return suma;
    }
}
