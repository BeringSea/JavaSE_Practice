/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentData;

import com.sun.org.apache.xml.internal.security.utils.UnsyncBufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.LinkedList;

/**
 *
 * @author David
 */
public class RezultatiKolokvijuma {
    LinkedList<Student> studenti = new LinkedList<>();
    
    public void unesiStudenta(String imePrezime, double brojPoena){
        Student student = new Student();
        student.setImePrezime(imePrezime);
        student.setBrojPoena(brojPoena);
        studenti.add(student);
    }
    public void upisiUFajl(){
        try {
            DataOutputStream dos = new DataOutputStream(new UnsyncBufferedOutputStream(new FileOutputStream("studenti.out")));
            if(studenti.size() > 0){
            for (int i = 0; i < studenti.size(); i++) {
                dos.writeUTF(studenti.get(i).getImePrezime());
                dos.writeChar('\t');
                dos.writeDouble(studenti.get(i).getBrojPoena());
                dos.writeChar('\n');
            }
            dos.close();
        }
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public void ucitajPodatke(){
        try {
            DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("studenti.out")));
            studenti.clear();
            while (dis.available() != 0) {
                Student student = new Student();
                student.setImePrezime(dis.readUTF());
                dis.readChar();
                student.setBrojPoena(dis.readDouble());
                dis.readChar();
                studenti.add(student);
            }
            dis.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public double prosek(){
        int brojac = 0;
        double suma = 0;
        for (int i = 0; i < studenti.size(); i++) {
            suma+=studenti.get(i).getBrojPoena();
            brojac++;
        }
        return suma/brojac;
    }
    public void najboljiStudent(){
        for (int i = 0; i < studenti.size(); i++) {
            if(studenti.get(i).getBrojPoena() == 100){
                System.out.println("Student sa brojem poena 100 je "+studenti.get(i));
            }
        }
    }
}
