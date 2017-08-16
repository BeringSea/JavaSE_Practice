/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IspitniRok;

/**
 *
 * @author David
 */
public class OceneNaIspitnomRokuTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OceneNaIspitnomRoku oceneNaIspitnomRoku = new OceneNaIspitnomRoku();
        oceneNaIspitnomRoku.unesiOcenu(7);
        oceneNaIspitnomRoku.unesiOcenu(5);
        oceneNaIspitnomRoku.unesiOcenu(7);
        oceneNaIspitnomRoku.unesiOcenu(8);
        oceneNaIspitnomRoku.unesiOcenu(10);
        
        oceneNaIspitnomRoku.ispisiOcenu();
    }
    
}
