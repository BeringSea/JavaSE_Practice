/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MuzickiUredjaj;

/**
 *
 * @author David
 */
public abstract class MuzickiUredjaj {
    public boolean ukljucen;
    public int jacinaTona = 0;
    
    public void ukljuci(){
        ukljucen = true;
    }
    public void iskljuci(){
        ukljucen = false;
    }
    public void pojacajTon(){
        if(jacinaTona < 40){
            jacinaTona++;
        }
    }
    public void smanjiTon(){
        if(jacinaTona > 0){
            jacinaTona--;
        }
    }
    public abstract void ispisi();
}
