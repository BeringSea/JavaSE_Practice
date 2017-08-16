/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koncert;

import com.sun.org.apache.xml.internal.security.utils.UnsyncBufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.LinkedList;

/**
 *
 * @author David
 */
public class KoncertnaSezona {
    LinkedList<Koncert> koncerti = new LinkedList<Koncert>();
    
    public void unesi(String grad, String bend){
        Koncert koncert = new Koncert();
        koncert.setGrad(grad);
        koncert.setBend(bend);
        
        koncerti.add(koncert);
    }
    public void upisiUFajl(){
        try {
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("koncerti.out")));
            if(koncerti.size() > 0){
                for (int i = 0; i < koncerti.size(); i++) {
                    dos.writeUTF(koncerti.get(i).getGrad());
                    dos.writeChar('\t');
                    dos.writeUTF(koncerti.get(i).getBend());
                    dos.writeChar('\n');
                }
            }
            dos.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public void koncertiB(){
        try {
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("koncertiB.out")));
            if(koncerti.size() > 0){
                for (int i = 0; i < koncerti.size(); i++) {
                    if(koncerti.get(i).getGrad().charAt(0)=='B'){
                        dos.writeUTF(koncerti.get(i).getGrad());
                        dos.writeChar('\t');
                        dos.writeUTF(koncerti.get(i).getBend());
                        dos.writeChar('\n');
                    }
                }
            }
            dos.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public void upisIzListe(){
        try {
            DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("koncerti.out")));
            koncerti.clear();
            while(dis.available() != 0){
                Koncert koncert = new Koncert();
                koncert.setGrad(dis.readUTF());
                dis.readChar();
                koncert.setBend(dis.readUTF());
                dis.readChar();
                koncerti.add(koncert);
            }
            dis.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public int brojKoncerataBenda(String bend){
        if(bend == null)
            throw new RuntimeException("Morate uneti ime benda");
        int brojac = 0;
        for (int i = 0; i < koncerti.size(); i++) {
            String imeBenda = koncerti.get(i).getBend();
            if(imeBenda.equals(bend)){
                brojac++;
            }
        }
        return brojac;
    }
    
    public int brojKoncerataUGradu(String grad){
        if(grad == null)
            throw new RuntimeException("Morate uneti ime grada");
        int brojac = 0;
        for (int i = 0; i < koncerti.size(); i++) {
            String imeGrada = koncerti.get(i).getGrad();
            if(imeGrada.equals(grad)){
                brojac++;
            }
        }
        return brojac;
    }
    public void bendSaNajviseKoncerata(){
        int maxKoncerata = 0;
        String maxBend = "";
        for (int i = 0; i < koncerti.size(); i++) {
            int brojKoncerata = brojKoncerataBenda(koncerti.get(i).getBend());
            if(brojKoncerata > maxKoncerata){
                maxKoncerata = brojKoncerata;
                maxBend = koncerti.get(i).getBend();
            }    
        }
        System.out.println("Bend koji ima najvise koncerata je "+maxBend+", broj koncerata je "+maxKoncerata);        
    }
    public void GradSaNajviseKoncerata(){
        int maxBend = 0;
        String maxGrad = "";
        for (int i = 0; i < koncerti.size(); i++) {
            int brojBendova = brojKoncerataUGradu(koncerti.get(i).getGrad());
            if(brojBendova > maxBend){
                maxBend = brojBendova;
                maxGrad = koncerti.get(i).getGrad();
            }
        }
        System.out.println("Grad sa najvise koncerata je "+maxGrad+", broj koncerata je "+maxBend);
    }
}
