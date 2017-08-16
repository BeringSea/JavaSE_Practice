/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IspisivacKategorije;

/**
 *
 * @author David
 */
public class IspisivacKategorijeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        try {
            IspisivacKategorije.ispisiKategorijuVisine(-205);
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
        try {
            IspisivacKategorije.ispisiKategorijuGodina(-10);
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
}
