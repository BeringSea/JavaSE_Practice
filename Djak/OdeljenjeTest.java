/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Djak;

/**
 *
 * @author David
 */
public class OdeljenjeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Odeljenje o = new Odeljenje();
        o.ucitajIzFajla();
        o.upisiOdlicne();
        o.upisiLose();
        o.ispisiDjake();
    }
}
