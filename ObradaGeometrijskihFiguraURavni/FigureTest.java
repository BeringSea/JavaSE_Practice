/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObradaGeometrijskihFiguraURavni;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class FigureTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ul = new Scanner(System.in);
        Figura[] fig = new Figura[100];
        int n = 0;
        double O = 0;
        double P = 0;
        
        while (true) {            
            System.out.println("Figura?");
            String vrs = ul.next();
            if(vrs.equals("."))
                break;
            Tacka T = new Tacka(ul.nextDouble(),ul.nextDouble());
            switch(vrs){
                case "O" : case "o":
                    fig[n] = new Krug(T,ul.nextDouble());
                    break;
                case "k": case "K":
                    fig[n] = new Kvadrat(T, ul.nextDouble());
                    break;
                case "t": case "T":
                    fig[n] = new Trougao(T, ul.nextDouble(), ul.nextDouble(), ul.nextDouble());
                    break;
            }
            if(fig[n] != null){
                O += fig[n++].Obim();
                P += fig[n].Povrsina();
            }
        }
        // Ispisivanje sadrzaja niza u glavnom izlazu
        System.out.println();
        for(int i=0;i<n;System.out.println(fig[i++]));
        // Ispisivanje poluobima i polupovrsine
        System.out.printf(("%nOsr=%.2f, Psr=%.2f%n%n"), O/n,P/n);
        // Citanje pomeraja za pomeranje figura
        System.out.println("dx,dy=?");
        double dx = ul.nextDouble(), dy=ul.nextDouble();
        System.out.println();
        // Pomeranje figura i ispisivanje na glavnom izlazu
        for(int i=0;i<n;System.out.print(fig[i++].pomeri(dx, dy)));
    }
}
