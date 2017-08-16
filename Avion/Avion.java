/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Avion;

/**
 *
 * @author David
 */
public class Avion {
     String[] sedista;
     
     public Avion(){
         sedista = new String[50];
         for (int i = 0; i < sedista.length; i++) {
             sedista[i] = null;
         }
     }
     public String getPutnik(int brojSedista){
         return sedista[brojSedista];
     }
     public void uvediPutnika(int brojSedista, String imePrezime){
         if(sedista[brojSedista] == null){
             sedista[brojSedista] = imePrezime;
             System.out.println("Putnik "+imePrezime+" uveden je na sediste br. "+brojSedista);
         }
         else{
             System.out.println("Sediste pod brojem "+ brojSedista+" vec je zauzima putnik "
                     +sedista[brojSedista]);
         }
     }
     public void izvediPutnika(int brojSedista){
         if(sedista[brojSedista] != null){
             sedista[brojSedista] = null;
             System.out.println("Sediste br. "+brojSedista+" vise ne zauzima putnik "+sedista[brojSedista]);
         }
         else{
             System.out.println("Sediste prod rednim brojem "+brojSedista+" je vec slobodno");
         }
     }
     public int brojSlobodnihMesta(){
         int brojacSlobodna = 0;
         for (int i = 0; i < sedista.length; i++) {
             if(sedista[i] == null)
                 brojacSlobodna++;
         }
        return brojacSlobodna;
     }
     public int brojZauzetihMesta(){
         int brojacZauzeta = 0;
         for (int i = 0; i < sedista.length; i++) {
             if(sedista[i] != null){
                 brojacZauzeta++;
             }
         }
         return brojacZauzeta;
     }
     public void ispisiImenaArsica(){
         for (int i = 0; i < sedista.length; i++) {
             if(sedista[i] != null){
                 String prezime = sedista[i].substring(sedista[i].indexOf(' ')+1);
                 if(prezime.equals("Arsic")){
                     String ime = sedista[i].substring(0,sedista[i].indexOf(' '));
                     System.out.println(ime);
                 }
             }
         }
     }
     public int brojPutnikaSaImenomNikola(){
         int brojac = 0;
         for (int i = 0; i < sedista.length; i++) {
             if(sedista[i]!=null){
                 String ime = sedista[i].substring(0,sedista[i].indexOf(' '));
                 if(ime.equals("Nikola")){
                     brojac++;
                 }
             }
         }
         return brojac;
     }
     public void ispisiStatus(){
         for (int i = 0; i < sedista.length; i++) {
             if(sedista[i]==null){
                 System.out.println("Sediste br. "+i+" je slobdno");
             }
             else{
                 System.out.println("Sediste br. "+i+" "+sedista[i]);
             }
         }
     }
}
