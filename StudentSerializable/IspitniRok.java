/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSerializable;

import com.sun.corba.se.impl.io.IIOPOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 *
 * @author David
 */
public class IspitniRok {
    
    public void upisiStudenta1(Student student){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("student1.out")));
            out.writeObject(student);
            out.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public void upisiStudenta2(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("student2.out")));
            Student student = new Student();
            System.out.println("Unesite ime i prezime studenta");
            student.setImePrezime(br.readLine());
            System.out.println("Unesite broj poena");
            student.setBrojPoena(Integer.parseInt(br.readLine()));
            
            out.writeObject(student);
            out.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public void ispisiStudente(){
        try {
            ObjectInputStream in1 = new ObjectInputStream(new BufferedInputStream(new FileInputStream("student1.out")));
            ObjectInputStream in2 = new ObjectInputStream(new BufferedInputStream(new FileInputStream("student2.out")));
            Student student1 = (Student)in1.readObject();
            Student student2 = (Student)in2.readObject();
            System.out.println(student1);
            System.out.println(student2);
            in1.close();
            in2.close();
            
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public void izracunajProsek(){
        try {
            ObjectInputStream in1 = new ObjectInputStream(new BufferedInputStream(new FileInputStream("student1.out")));
            ObjectInputStream in2 = new ObjectInputStream(new BufferedInputStream(new FileInputStream("student2.out")));
            Student student1 = (Student)in1.readObject();
            Student student2 = (Student)in2.readObject();
            int zbir = student1.getBrojPoena() + student2.getBrojPoena();
            System.out.println("Prosecan broj poena studenata "+ zbir/2);
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
}
