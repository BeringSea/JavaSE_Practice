/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vozilo;

/**
 *
 * @author David
 */
public class Automobil extends Vozilo{

    @Override
    public boolean daLiIdePoKopnu() {
        return true;
    }

    @Override
    public boolean daLiIdePoVodi() {
       return false;
    }

    @Override
    public boolean daLiIdePoVazduhu() {
       return false;
    }
    
    public void ispisiAutomobil(){
        System.out.println("U pitanju je automobil ...");
        System.out.println("Marka outomobila je  "+getMarka());
        System.out.println("Model automobila je "+getModel());
    }
}
