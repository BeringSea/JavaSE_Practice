/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeometrijskoTelo;

/**
 *
 * @author David
 */
public class GeometrijskoTeloTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kocka kocka = new Kocka();
        kocka.sedDuzinaStranice(20.5);
        
        Kvadar kvadar = new Kvadar();
        kvadar.setDuzina(20);
        kvadar.setSirina(10);
        kvadar.setVisina(30);
        
        System.out.println("Povrsina kocke je "+kocka.getPovrsina());
        System.out.println("Zapremina kocke je "+kocka.getZapremina());
        System.out.println("Povrsina kvadra je "+kvadar.getPovrsina());
        System.out.println("Zapremina kvadra je "+kvadar.getZapremina());
    }
    
}
