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
public class Trougao extends Figura{

    private double a,b,c;
    
    public Trougao(){
        super();
        this.a=1;
        this.b=1;
        this.c=1;
    }
    public Trougao(double a,double b,double c){
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Trougao(Tacka t, double a, double b, double c){
        super(t);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double Obim() {
       return this.a + this.b + this.c;
    }

    @Override
    public double Povrsina() {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public String toString() {
        return "Trougao [ "+super.toString()+" a= "+a+" b= "+b+" c= "+c+" Obim= "+Obim()+" Povrsina= "+Povrsina()+" ]";
    }
    
}
