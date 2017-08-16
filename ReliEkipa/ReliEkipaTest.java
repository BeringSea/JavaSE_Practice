/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReliEkipa;

/**
 *
 * @author David
 */
public class ReliEkipaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ReliEkipaLista ekipe = new ReliEkipaLista();
        ReliEkipa e1 = new ReliEkipa();
        ReliEkipa e2 = new ReliEkipa();
        ReliEkipa e3 = new ReliEkipa();
        ReliEkipa e4 = new ReliEkipa();
        ReliEkipa e5 = new ReliEkipa();
        ReliEkipa e6 = new ReliEkipa();
        ReliEkipa e7 = new ReliEkipa();
        ReliEkipa e8 = new ReliEkipa();
        ReliEkipa e9 = new ReliEkipa();
        ReliEkipa e10 = new ReliEkipa();
        ReliEkipa e11 = new ReliEkipa();
        
        e1.setImeEkipe("Audi");
        e1.setBrojPoena(30);
        e2.setImeEkipe("BMW");
        e2.setBrojPoena(40);
        e3.setImeEkipe("Renault");
        e3.setBrojPoena(20);
        e4.setImeEkipe("VW");
        e4.setBrojPoena(5);
        e5.setImeEkipe("Subaru");
        e5.setBrojPoena(30);
        e6.setImeEkipe("Peugeot");
        e6.setBrojPoena(33);
        e7.setImeEkipe("Ford");
        e7.setBrojPoena(50);
        e8.setImeEkipe("Mitcubishi");
        e8.setBrojPoena(4);
        e9.setImeEkipe("Lancia");
        e9.setBrojPoena(23);
        e10.setImeEkipe("Skoda");
        e10.setBrojPoena(15);
        e11.setImeEkipe("Seat");
        e11.setBrojPoena(0);
        
        ekipe.unesiEkipu(e1);
        ekipe.unesiEkipu(e2);
        ekipe.unesiEkipu(e3);
        ekipe.unesiEkipu(e4);
        ekipe.unesiEkipu(e5);
        ekipe.unesiEkipu(e6);
        ekipe.unesiEkipu(e7);
        ekipe.unesiEkipu(e8);
        ekipe.unesiEkipu(e9);
        ekipe.unesiEkipu(e10);
        ekipe.unesiEkipu(e11);
        
        //ekipe.ispisi();
        //ekipe.ispisiObrnuto();
        //ekipe.ispisiDesetNajboljih();
        
        ReliEkipa izmena = new ReliEkipa();
        izmena.setImeEkipe("BMW");
        izmena.setBrojPoena(55);
        ekipe.promeniPoziciju(izmena);
        ekipe.ispisi();
        
    }
}
