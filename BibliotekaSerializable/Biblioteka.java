/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BibliotekaSerializable;

import com.sun.corba.se.impl.io.IIOPInputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

/**
 *
 * @author David
 */
public class Biblioteka {
    LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();
    public void unesiKnjigu(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Knjiga knjiga = new Knjiga();
            System.out.println("Unesite naslov");
            knjiga.setNaslov(br.readLine());
            System.out.println("Unesite ISBN");
            knjiga.setISBN(br.readLine());
            System.out.println("Unesite autora");
            knjiga.setAutor(br.readLine());
            if(knjige.contains(knjiga)){
                System.out.println("Knjiga vec postoji");
            }
            else{
                knjige.add(knjiga);
            }
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public void unesiKnjiguKlasa(Knjiga knjiga){
        if(knjiga == null)
            throw new RuntimeException("Morate uneti knjigu");
        else
            knjige.add(knjiga);
    }
    public void upisiKnjige(){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("knjige.out")));
            out.writeObject(knjige);
            out.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public void iscitajIPopuniBiblioteku(){
        try {
            ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("knjige.out")));
            knjige.clear();
            try {
                while (true) {                    
                    LinkedList<Knjiga> k = (LinkedList<Knjiga>)(in.readObject());
                    knjige = k;
                    for (int i = 0; i < knjige.size(); i++) {
                        System.out.println(knjige.get(i));
                    }
                }
            } catch (EOFException e) {}
             in.close();
        } catch (Exception e) {
            System.out.println("Greska: "+e.getMessage());
        }
    }
    public void ispisiIzListe(){
        if(knjige.isEmpty()){
            System.out.println("Biblioteka je prazna ...");
        }
        else{
            for (int i = 0; i < knjige.size(); i++) {
                System.out.println(knjige.get(i));
            }
        }
    }
}
