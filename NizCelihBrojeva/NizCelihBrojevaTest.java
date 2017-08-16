/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NizCelihBrojeva;

/**
 *
 * @author David
 */
public class NizCelihBrojevaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NizCelihBrojeva n1 = new NizCelihBrojeva(3);
        NizCelihBrojeva n2 = new NizCelihBrojeva(5);
        NizCelihBrojeva n3 = new NizCelihBrojeva(10);
        
        n1.dodavanjeElemenataUNIz(1);
        n1.dodavanjeElemenataUNIz(-1);
        n1.dodavanjeElemenataUNIz(3);
        
        n2.dodavanjeElemenataUNIz(34);
        n2.dodavanjeElemenataUNIz(45);
        
        n3.dodavanjeElemenataUNIz(56);
        n3.dodavanjeElemenataUNIz(67);
        n3.dodavanjeElemenataUNIz(-89);
        
        
        System.out.println("Zbir prvog i poslednjeg elementa niza je: "+n1.zbirPrveIPoslednjeVrednosti());
        n2.parniBrojevi();
        n3.ispisiObrnuto();
    }
    
}
