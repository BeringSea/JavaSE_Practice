/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalizatorSlovaUTekstu;

/**
 *
 * @author David
 */
public class AnalizatorSlovaUTekstuTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AnalizatorSlovaUTekstu ast = new AnalizatorSlovaUTekstu();
        ast.setTekst("Dan je lep. Da li je dan lep? Da, stvarno je LEP!" );
        
        System.out.println("Najmanje se pojavljuje slovo "+ast.minPonavljanjeSlova());
        System.out.println("Najvise se pojavljuje slovo "+ast.maxPojavljivanjeSlova());
    }
}
