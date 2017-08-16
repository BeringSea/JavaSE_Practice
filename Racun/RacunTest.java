/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Racun;

/**
 *
 * @author David
 */
public class RacunTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Racun racun = new Racun();
        try {
            racun.setBroj(0);
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        
        }
//        try {
//            racun.setProizvod(null);
//        } catch (Exception e) {
//            System.out.println("Greska: "+e.getMessage());
//        }
//        try {
//            racun.setIznos(-5.2);
//        } catch (Exception e) {
//            System.out.println("Greska: "+e.getMessage());
//        }
        racun.setProizvod("Sampon");
        racun.setIznos(22.5);
        System.out.println(racun);
    }
}
