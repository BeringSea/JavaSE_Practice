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
public abstract class GeometrijskoTelo {
    public double povrsina;
    public double zapremina;
    
    public abstract void izracunajPovrsinu();
    public abstract void izracunajZapreminu();
    
    public double getPovrsina(){
        izracunajPovrsinu();
        return povrsina;
    }
    public double getZapremina(){
        izracunajZapreminu();
        return zapremina;
    }
}
