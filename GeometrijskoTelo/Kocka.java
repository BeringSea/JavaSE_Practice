/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeometrijskoTelo;

/**
 *
 * @author David
 */
public class Kocka extends GeometrijskoTelo{
    
    private double duzinaStranice;
    
    public double getDuzinaStranice(){
        return duzinaStranice;
    }
    public void sedDuzinaStranice(double duzinaStranice){
        if(duzinaStranice > 0){
            this.duzinaStranice = duzinaStranice;
        }
        else{
            System.out.println("Greska");
        }
    }
    
    @Override
    public void izracunajPovrsinu() {
        povrsina = Math.pow(duzinaStranice,2) * 6;
    }

    @Override
    public void izracunajZapreminu() {
        zapremina = Math.pow(duzinaStranice, 3);
    }
    
}
