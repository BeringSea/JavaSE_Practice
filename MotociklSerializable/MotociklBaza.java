/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MotociklSerializable;

import com.sun.org.apache.xml.internal.security.utils.UnsyncBufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

/**
 *
 * @author David
 */
public class MotociklBaza {
    LinkedList<Motocikl> motocikli;
    public MotociklBaza(){
        motocikli = new LinkedList<>();
    }
    public void unesiUBazu(Motocikl moto){
        if(moto == null || motocikli.contains(moto)){
            System.out.println("Greska pri unosu u bazu");
        }
        else{
            motocikli.add(moto);
        }
    }
    public void upisiUFajl(){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("motocikli.out")));
            out.writeObject(motocikli);
            out.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public void popuniListuIzFajla(){
        try {
            ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("motocikli.out")));
            motocikli.clear();
            try {
                while (true) {                    
                    LinkedList<Motocikl> motos = (LinkedList<Motocikl>)in.readObject();
                    motocikli = motos;
                    LinkedList<Motocikl> motori = motocikli;
                    for (int i = 0; i < motori.size(); i++) {
                        System.out.println(motori.get(i));
                    }
                }
            } catch (EOFException e) {
            }
            in.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public void ispisi(){
        if(motocikli.isEmpty()){
            System.out.println("Baza je prazna");
        }
        else{
            for (int i = 0; i < motocikli.size(); i++) {
                System.out.println(motocikli.get(i));
            }
        }
    }
}
