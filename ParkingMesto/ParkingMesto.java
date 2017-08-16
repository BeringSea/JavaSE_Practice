/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkingMesto;

/**
 *
 * @author David
 */
public class ParkingMesto {
    private boolean slobodno;
    private String registarskiBroj;

    public boolean isSlobodno() {
        return slobodno;
    }

    public void setSlobodno(boolean slobodno) {
        this.slobodno = slobodno;
    }

    public String getRegistarskiBroj() {
        return registarskiBroj;
    }

    public void setRegistarskiBroj(String registarskiBroj) {
        this.registarskiBroj = registarskiBroj;
    }

    @Override
    public String toString() {
        if(isSlobodno()){
            return "Parking mesto je slobodno ";
        }
        else{
            return "Registarski broj "+this.registarskiBroj;
        }
    }
}
