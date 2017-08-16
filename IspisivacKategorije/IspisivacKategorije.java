/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IspisivacKategorije;

import java.awt.AWTException;

/**
 *
 * @author David
 */
public class IspisivacKategorije {
    public static void ispisiKategorijuVisine(int visina) throws Exception{
        if(visina < 120 || visina > 250){
            throw new Exception("Visina je van granica");
        }
        if(visina < 165){
            System.out.println("Kategorija niskih ljudi");
        }
        if(visina >= 165 && visina < 185){
            System.out.println("Kategorija srednje viskokih ljudi");
        }
        if(visina >= 185){
            System.out.println("Kategorija visikih ljudi");
        }
    }
    public static void ispisiKategorijuGodina(int brojGodina) throws Exception{
        if(brojGodina < 0 || brojGodina > 125){
            throw new Exception("Godine su van granica");
        }
        if(brojGodina <=29){
            System.out.println("Kategorija mladih ljudi");
        }
        if(brojGodina > 29 && brojGodina <= 55){
            System.out.println("Kategorija zrelih ljudi");
        }
        if(brojGodina > 55){
            System.out.println("Kategorija starih ljudi");
        }
    }
}
