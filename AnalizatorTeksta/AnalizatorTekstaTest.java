/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalizatorTeksta;

/**
 *
 * @author David
 */
public class AnalizatorTekstaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AnalizatorTeksta a1 = new AnalizatorTeksta();
        AnalizatorTeksta a2 = new AnalizatorTeksta("Danas je lep dan.");
        
        a1.setText("Nebo je plavo");
        a1.dodajNaKraj("Sunce sija.");
        a2.proveraJednakosti("lep dan");
        
        System.out.println(a1.getText());
        System.out.println(a2.getText());
    }
    
}
