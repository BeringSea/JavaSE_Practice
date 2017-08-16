/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MotociklSerializable;

import java.io.Serializable;

/**
 *
 * @author David
 */
public class Motocikl implements Serializable{
    private String marka;
    private String model;
    private int kubikaza;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        if(marka == null)
            throw new RuntimeException("Morate uneti marku");
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model == null)
            throw new RuntimeException("Morate uneti model");
        this.model = model;
    }

    public int getKubikaza() {
        return kubikaza;
    }

    public void setKubikaza(int kubikaza) {
        if(kubikaza <= 0)
            throw new RuntimeException("Kupikaza mora biti veca od nule");
        this.kubikaza = kubikaza;
    }

    @Override
    public String toString() {
        return "Marka: "+this.marka+" Model: "+this.model+" Kubikaza: "+this.kubikaza;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Motocikl){
            Motocikl moto = (Motocikl)obj;
            if(marka.equals(moto.getMarka()) && model.equals(moto.getModel()) && kubikaza == moto.getKubikaza()){
                return true;
            }
        }
        return false;
    }
}
