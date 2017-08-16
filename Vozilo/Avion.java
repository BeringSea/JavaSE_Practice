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
public class Avion extends Vozilo{

    @Override
    public boolean daLiIdePoKopnu() {
        return false;
    }

    @Override
    public boolean daLiIdePoVodi() {
        return false;
    }

    @Override
    public boolean daLiIdePoVazduhu() {
        return true;
    }
    public void ispisiAvion(){
        System.out.println("U pitanju je avion ...");
        System.out.println("Marka aviona je "+getMarka());
        System.out.println("Model aviona je "+getModel());
    }
}
