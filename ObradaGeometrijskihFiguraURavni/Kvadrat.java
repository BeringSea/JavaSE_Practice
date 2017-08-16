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
public class Kvadrat extends Figura{

    private double a;
    
    public Kvadrat(){
        super();
        this.a = 1;
    }
    public Kvadrat(double a){
        super();
        this.a = a;
    }
    public Kvadrat(Tacka t, double a){
        super(t);
        this.a = a;
    }
    @Override
    public double Obim() {
        return 4 * this.a;
    }

    @Override
    public double Povrsina() {
        return Math.pow(this.a, 2);
    }

    @Override
    public String toString() {
        return "Kvadrat [ "+super.toString()+" a= "+this.a+" Obim= "+Obim()+" Povrsina= "+Povrsina() + " ]";
    }
    
}
