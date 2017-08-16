/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProveraNizaBrojeva;

/**
 *
 * @author David
 */
public class NizCelihBrojeva {
    private int [] nizCelihBrojeva = new int[10];
    private int brojac = 0;
    
    public NizCelihBrojeva(){}
    
    public void dodajUNiz(int broj){
        nizCelihBrojeva[brojac] = broj;
        brojac++;
    }
    public void prviElement(){
        System.out.print(nizCelihBrojeva[0]+ "\n");
    }
    public void ispisiElement(int indeks){
        System.out.print(nizCelihBrojeva[indeks]);
    }
    public void sviElementiNiza(){
        for(int i=0; i<brojac; i++){
            System.out.print(nizCelihBrojeva[i] + " ");
        }
        System.out.println();
    }
    public int sumaElemenataNiza(){
        int suma = 0;
        for(int i=0;i<brojac;i++){
            suma+=nizCelihBrojeva[i];
        }
        return suma;
    }
    public int najmanjiUNizu(){
        int min = nizCelihBrojeva[0];
        for(int i=0;i<brojac;i++){
            if(nizCelihBrojeva[i]<min){
                min = nizCelihBrojeva[i];
            }
        }
        return min;
    }
    public int najveciUNizu(){
        int max = nizCelihBrojeva[0];
        for(int i=0; i<brojac; i++){
            if(nizCelihBrojeva[i] > max){
                max = nizCelihBrojeva[i];
            }
        }
        return max;
    }
    public boolean daLiPostojiUNizu(int broj){
        for(int i=0; i<brojac; i++){
            if(nizCelihBrojeva[i] == broj)
                return true;
        }
        return false;
    }
}
