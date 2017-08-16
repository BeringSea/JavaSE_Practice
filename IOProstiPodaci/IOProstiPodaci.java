/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOProstiPodaci;

import com.sun.org.apache.bcel.internal.util.ByteSequence;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author David
 */
public class IOProstiPodaci {
    public static void upisiRealne(){
        try {
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("brojevi.out")));
            dos.writeDouble(12.2);
            dos.writeDouble(1.01);
            dos.writeDouble(55.55);
            dos.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public static void citajRealne(){
        try {
            DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("brojevi.out")));
            while (dis.available() != 0) {                
                System.out.println(dis.readDouble());
            }
            dis.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public static void visine(int[] visina){
        try {
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("visine.out")));
            if(visina.length > 0){
                for (int i = 0; i < visina.length; i++) {
                    dos.writeInt(visina[i]);
                }
            }
            dos.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public static void citajVisina(){
        try {
            DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("visine.out")));
            double suma = 0;
            int brojac = 0;
            while (dis.available() != 0) {                
                suma+=dis.readInt();
                brojac++;
            }
            System.out.println("Prosecna visina kosarkasa je "+suma/brojac);
            dis.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public static void upisiTezinu(double [] tezina){
        try {
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("tezine.out")));
            if(tezina.length > 0){
                for (int i = 0; i < tezina.length; i++) {
                    dos.writeDouble(tezina[i]);
                    dos.writeChar('\n');
                }
            }
            else{
                System.out.println("Morate uneti tezinu boksera ... ");
            }
            dos.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public static void citajMaxTezinu(){
        try {
            DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("tezine.out")));
            double max = 0;
            while (dis.available() != 0) {                
                double t = dis.readDouble();
                if(t > max)
                    max = t;
                dis.readChar();
            }
            System.out.println("Najtezi bokser od unetih je "+max);
            dis.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public static void proizvodi(String[] proizvodi){
         try {
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("proizvodi.out")));
            if(proizvodi.length > 0){
                for (int i = 0; i < proizvodi.length; i++) {
                    dos.writeUTF(proizvodi[i]);
                    dos.writeChar('\t');
                }
            }
            else{
                System.out.println("Morate uneti proizvod");
            }
            dos.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public static void citajProizvode(){
        try {
            DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("proizvodi.out")));
            while (dis.available() != 0) {                
               System.out.println(dis.readUTF());
               dis.readChar();
            }
            dis.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
}
