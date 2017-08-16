/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteka;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 *
 * @author David
 */
public class Biblioteka {
    LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public void ucitajPodatke(){
        try {
            Knjiga k = new Knjiga();
            System.out.println("Unesite naziv knjige");
            //String naslov = br.readLine();
            k.setNaslov(br.readLine());
            System.out.println("Unesite IBSN knjige");
            //String IBSN = br.readLine();
            k.setISBN(br.readLine());
            System.out.println("Unesite autora knjige");
            //String autor = br.readLine();
            k.setAutor(br.readLine());
            if(knjige.contains(k))
                throw new RuntimeException("Knjiga vec posotji u biblioteci");
                knjige.add(k);
            
        } catch (Exception e) {
            System.err.println("Greska: "+e.getMessage());
        }
    }
    public void unesiViseKnjiga(){
        boolean kraj = false;
        while (!kraj) {            
            ucitajPodatke();
            try {
                System.out.println("Da li zelite da unesete jos neku knjigu (da/ne)");
                String da = br.readLine();
                if(!da.equalsIgnoreCase("da")){
                    kraj = true;
                }
            } catch (Exception e) {
            }
        }
    }
    public void ispisi(){
        if(knjige.isEmpty()){
            System.out.println("Biblioteka je prazna");
        }
        else{
            for (int i = 0; i < knjige.size(); i++) {
                System.out.println("Podaci o knjigama "+knjige.get(i));
            }
        }
    }
}
