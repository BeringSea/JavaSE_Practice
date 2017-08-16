/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NizInt;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author David
 */
public class NizInt {
    private int[] niz;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void inicijalizujNiz(){
        try {
            System.out.println("Unesi kapacitet niza: ");
            int broj = Integer.parseInt(br.readLine());
            for (int i = 0; i < broj; i++) {
                if(broj <=0){
                    niz = new int[10];
                }
                else{
                    niz = new int[broj];
                }
            }
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
            niz = new int[10];
        }
    }
    public void unesiElemente(){
        if(niz == null) throw new RuntimeException("Niz nije inicijalizovan");
            for (int i = 0; i < niz.length; i++) {
                try {
                    System.out.println("Unesite "+i+". element niza");
                int element  = Integer.parseInt(br.readLine());
                niz[i] = element;
                } catch (Exception e) {
                    System.out.println("Greska pri unosu "+i+". elemeta niza "+e.getMessage());
                }
         }
    }
    public void ispisi(){
        if(niz == null) throw new RuntimeException("Niz nije inicijalizovan ");
        for (int i = 0; i < niz.length; i++) {
            System.out.println("Elementi niza su "+niz[i]);
        }
    }
}
