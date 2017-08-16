/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Motocikl;

/**
 *
 * @author David
 */
public class Motocikl {
    private String marka;
    private String model;
    private int kubukaza;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getKubukaza() {
        return kubukaza;
    }

    public void setKubukaza(int kubukaza) {
        this.kubukaza = kubukaza;
    }

    @Override
    public String toString() {
        return "Marka: "+this.marka+" Model: "+this.model+" Kubikaza: "+this.kubukaza;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Motocikl){
            Motocikl motocikl = (Motocikl)obj;
            if(this.marka.equals(motocikl.getMarka()) && this.model.equals(motocikl.getModel())
                    && this.kubukaza == motocikl.getKubukaza()){
                return true;
            }
        }
        return false;
    }
}
