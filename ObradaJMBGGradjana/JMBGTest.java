/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObradaJMBGGradjana;

/**
 *
 * @author David
 */
public class JMBGTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long[] niz = {123,345,123,789};
        for(long jmbg : niz){
            if(!JMBG.ima(jmbg))
                new JMBG(jmbg);
            else
                System.err.println("*** Vec postoji "+jmbg+" !");
        }
        System.out.println(JMBG.svi());
    }
    
}
