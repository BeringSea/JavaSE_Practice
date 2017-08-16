/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Takmicar;

/**
 *
 * @author David
 */
public class TakmicarTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaRezultata listaRezultata = new ListaRezultata();
        Takmicar t1 = new Takmicar();
        Takmicar t2 = new Takmicar();
        Takmicar t3 = new Takmicar();
        Takmicar t4 = new Takmicar();
        Takmicar t5 = new Takmicar();
        Takmicar t6 = new Takmicar();
        
        
        t1.setZemlja("Grcka");
        t1.setImePrezime("Costas Pappas");
        t1.setVreme(23.1);
        t2.setZemlja("SAD");
        t2.setImePrezime("Colin Firth");
        t2.setVreme(20.12);
        t3.setZemlja("Rusija");
        t3.setImePrezime("Ivan Ivanovic");
        t3.setVreme(19.5);
        t4.setZemlja("Turska");
        t4.setImePrezime("Muhamed Turk");
        t4.setVreme(0);
        t5.setZemlja("Velika Britanija");
        t5.setImePrezime("John Pale");
        t5.setVreme(22.78);
        t6.setZemlja("SAD");
        t6.setImePrezime("Jack Stone");
        t6.setVreme(0);
        
        
        listaRezultata.unesiTakmicara(t1);
        listaRezultata.unesiTakmicara(t2);
        listaRezultata.unesiTakmicara(t3);
        listaRezultata.unesiTakmicara(t4);
        listaRezultata.unesiTakmicara(t5);
        listaRezultata.unesiTakmicara(t6);
        
        //listaRezultata.ispisi();
        //listaRezultata.ispisiReprezentativce("SAD");
        listaRezultata.daLiJeOborenRekord(19.3);
    }
}
