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
public abstract class Vozilo {
    public String marka;
    public String model;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        if(marka != null){
            this.marka = marka;
        }
        else{
            System.out.println("Greska");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model != null){
            this.model = model;
        }
        else{
            System.out.println("Greska");
        }
    }
    public abstract boolean daLiIdePoKopnu();
    public abstract boolean daLiIdePoVodi();
    public abstract boolean daLiIdePoVazduhu();
    
    public void ispisi(){
        if(daLiIdePoKopnu()){
            System.out.println("Vozilo ide po kopnu ...");
        }
        if(daLiIdePoVodi()){
            System.out.println("Vozilo ide po vodi ...");
        }
        if(daLiIdePoVazduhu()){
            System.out.println("Vozilo leti po vazduhu ...");
        }
    }
}
