/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObradaGeometrijskihFiguraURavni;

/**
 *
 * @author David
 */
public class Krug extends Figura{

    private double r;
    
    public Krug(){ // inicijalizacija kruga polprecnika 1 u koordinatnom pocetku
        super();
        this.r = 1;
    }
    public Krug(double r){ // inicijalizacija kruga sa zadatim poluprecnikom u koor. pocetku
        super();
        this.r = r;
    }
    public Krug(Tacka t, double r){ // inicijalizacija u zeljeni polozaj i poluprecnik
        super(t);
        this.r = r;
    }
    
    @Override
    public double Obim() {
        return 2*this.r*Math.PI;
    }

    @Override
    public double Povrsina() {
        return Math.pow(this.r, 2)*Math.PI;
    }

    @Override
    public String toString() {
        return "Krug [ "+super.toString()+" r= "+this.r+" Obim= "+Obim()+" Povrsina= "+Povrsina()+" ]";
    }
    
}
