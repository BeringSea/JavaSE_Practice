/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClanKomisije;

/**
 *
 * @author David
 */
public class KomisijaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Komisija k = new Komisija();
        ClanKomisije clan = new ClanKomisije();
        ClanKomisije clan1 = new ClanKomisije();
        clan.setImePrezime("Pera Peric");
        clan.setFunkcija("predsednik");
        clan1.setImePrezime("Mika Mikic");
        k.unesi(clan);
        k.unesi(clan1);
        
        k.ispis();
    }
    
}
