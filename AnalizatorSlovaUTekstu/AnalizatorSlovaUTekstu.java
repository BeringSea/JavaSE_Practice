/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalizatorSlovaUTekstu;

/**
 *
 * @author David
 */
public class AnalizatorSlovaUTekstu {
    String tekst = "nepoznat";
    
    public String getTekst(){
        return this.tekst;
    }
    
    public void setTekst(String noviTekst){
        if(noviTekst != null){
            this.tekst = noviTekst;
        }
        else{
            System.err.println("String je prazan ...");
        }
    }
    public int brojZnakovaUTekstu(){
        return this.tekst.length();
    }
    public int brojPonavljanjaMalogA(){
        int brojac = 0;
        for (int i = 0; i < tekst.length(); i++) {
            if(tekst.charAt(i) == 'a'){
                brojac++;
            }
        }
        return brojac;
    }
    public int brojPojavljivanjaSlova(char slovo){
        int brojac = 0;
        for (int i = 0; i < tekst.length(); i++) {
            if(tekst.charAt(i) == slovo){
                brojac++;
            }
        }
        return brojac;
    }
    public int brojRecenica(){
        int brojac = 0;
        for (int i = 0; i < this.tekst.length(); i++) {
            if((tekst.charAt(i) == '.') || (tekst.charAt(i) == '?' || (tekst.charAt(i) == '!'))){
                brojac++;
            }
        }
        return brojac;
    }
    public char maxPojavljivanjeSlova(){
        char maxSlovo = tekst.charAt(0);
        int maxBroj = 0;
        for (int i = 0; i < tekst.length(); i++) {
            if((brojPojavljivanjaSlova(tekst.charAt(i)) > maxBroj) && (tekst.charAt(i)!=' ')){
                maxBroj = brojPojavljivanjaSlova(tekst.charAt(i));
                maxSlovo = tekst.charAt(i);
            }
        }
        return maxSlovo;
    }
    public char minPonavljanjeSlova(){
        char minSlovo = tekst.charAt(0);
        int minBroj = 0;
        for (int i = 0; i < tekst.length(); i++) {
            if((brojPojavljivanjaSlova(tekst.charAt(i)))<minBroj && (tekst.charAt(i)!= ' ')){
                minBroj = brojPojavljivanjaSlova(tekst.charAt(i));
                minSlovo = tekst.charAt(i);
            }
        }
        return minSlovo;
    }
    int prviRedniBrojSlovaA(){
        return tekst.indexOf("a");
    }
    int poslednjiRedniBrojSlovaA(){
        return tekst.lastIndexOf("a");
    }
}
