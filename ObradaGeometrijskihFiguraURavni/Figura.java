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
public abstract class Figura {
    
    private Tacka T;
    
    public Figura(){
        T = new Tacka(); // inicijalizacija
    }
    public Figura(Tacka TT){
        this.T = TT;
    }
    public final Figura postavi(double x, double y){ // postavljanje u novu tacku
        T = new Tacka(x, y);
        return this;
    }
    public final Figura pomeri(double dx, double dy){ // pomeranje za dati pomak
        T = new Tacka(T.x() + dx, T.y() + dy);
        return this;
    }
    public abstract double Obim(); // Obim
    
    public abstract double Povrsina(); // Povrsina

    @Override
    public String toString() {
        return "T = "+T;
    }
}
