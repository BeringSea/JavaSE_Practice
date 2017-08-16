/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObradaGeometrijskihFiguraURavni;
import static java.lang.Math.*;

/**
 *
 * @author David
 */
public class Tacka {
    private double x,y; // koordinate tacke
    
    public Tacka(){} // inicijalizacija u koordinatnom pocetku
    
    public Tacka(double x, double y){ // inicijalizacija zadatim koordinatama
        this.x = x;
        this.y = y;
    }
    
    public double x(){
        return x;
    }                   //dohvatanje koordinata
    public double y(){
        return y;
    }
    public double rastojanjeTacka(Tacka tacka){ // rastojanje izmedju dve tacke
        return sqrt(pow(x-tacka.x, 2) + pow(y-tacka.y, 2));
    }

    @Override
    public String toString() { // tekstualni prikaz
        return String.format("%.2f,%.2f", this.x, this.y);
    }
    public static final Tacka ORG = new Tacka(); // postavljanje tacke u koordinatni pocetak
}
