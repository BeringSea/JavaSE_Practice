/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NizCena;

/**
 *
 * @author David
 */
public class NizCenaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NizCena nizCena = new NizCena();
        nizCena.dodajCenu(123.0);
        nizCena.dodajCenu(234.55);
        nizCena.dodajCenu(301.0);
        nizCena.dodajCenu(5000.0);
        
        
        
        System.out.print("Cene koje su vece od 300 su ");
        nizCena.ceneVeceOdZadate(300);
        
        System.out.println("Razlika izmedju najvise i najnize cene " + nizCena.prosecnaCena());
    }
    
}
