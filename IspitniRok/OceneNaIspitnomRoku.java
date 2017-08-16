/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IspitniRok;

/**
 *
 * @author David
 */
public class OceneNaIspitnomRoku {
    private int [] oceneStudenta = new int[100];
    private int brojac = 0;
    
    public void unesiOcenu(int ocena){
        oceneStudenta[brojac] = ocena;
        brojac++;
    }
    public void ispisiOcenu(){
        for(int i=0;i<brojac;i++){
            System.out.print( oceneStudenta[i] + " ");
        }
    }
}
