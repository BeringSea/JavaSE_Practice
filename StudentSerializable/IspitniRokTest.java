/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSerializable;

/**
 *
 * @author David
 */
public class IspitniRokTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IspitniRok ir = new IspitniRok();
        Student student = new Student();
        student.setImePrezime("Jovana Sovilj");
        student.setBrojPoena(100);
        //ir.upisiStudenta2();
        ir.upisiStudenta1(student);
        ir.ispisiStudente();
        ir.izracunajProsek();
    }
}
