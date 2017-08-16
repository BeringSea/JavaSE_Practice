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
public class Kvadar extends GeometrijskoTelo{
    private double duzina;
    private double sirina;
    private double visina;

    public double getDuzina() {
        return duzina;
    }

    public void setDuzina(double duzina) {
        if(duzina > 0){
            this.duzina = duzina;
        }
        else{
            System.out.println("Greska");
        }
    }

    public double getSirina() {
        return sirina;
    }

    public void setSirina(double sirina) {
        if(sirina > 0){
            this.sirina = sirina;
        }
        else{
            System.out.println("Greska");
        }
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        if(visina > 0){
            this.visina = visina;
        }
        else{
            System.out.println("Greska");
        }
    }

    @Override
    public void izracunajPovrsinu() {
        povrsina = 2*(duzina * sirina)+2*(duzina * sirina)+2*(duzina * sirina);
    }

    @Override
    public void izracunajZapreminu() {
        zapremina = duzina * sirina * visina;
    }
}
