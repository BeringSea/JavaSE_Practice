/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author David
 */
public class StudentTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IspitnaLista studenti = new IspitnaLista();
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        
        s1.setBrojIndeksa("0001/99");
        s1.setPrezime("Stevanovic");
        s1.setIme("Ivana");
        s1.setOcena(10);
        
        s2.setBrojIndeksa("0123/06");
        s2.setPrezime("Petrovic");
        s2.setIme("Petar");
        s2.setOcena(6);
        
        s3.setBrojIndeksa("0021/05");
        s3.setPrezime("Jovanovic");
        s3.setIme("Jovan");
        s3.setOcena(8);
        
        studenti.dodajStudenta(s1);
        studenti.dodajStudenta(s2);
        studenti.dodajStudenta(s3);
        
        //studenti.ispisi();
        System.out.println("Prosecna ocena studenata je: "+studenti.prosek());
        System.out.print("Stari studenti: ");
        studenti.ispisiStareStudente();
    }
    
}
