/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutomatNovca;

/**
 *
 * @author David
 */
public class AutomatNovcaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AutomatNovca at1 = new AutomatNovca();
        at1.uloziNovac(2000);
        at1.ispisi();
        
        AutomatNovca at2 = new AutomatNovca();
        at2.podigniNovac(500);
        at2.ispisi();
    }
    
}
