/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalizatorTeksta;

/**
 *
 * @author David
 */
public class AnalizatorTeksta {
    private String tekst;
    
    public AnalizatorTeksta(){
        tekst = "nepoznat";
    }
    public AnalizatorTeksta(String tekst){
        if(tekst != null){
            this.tekst = tekst;
        }
        else{
            System.err.println("Morate uneti neki tekst ...");
            tekst = "nepoznat";
        }
    }
    public String getText(){
        return tekst;
    }
    public void setText(String noviTekst){
        if(noviTekst != null){
            this.tekst = noviTekst;
        }
        else{
            System.out.println("Ne mozete uneti prazan String...");
        }
    }
    public void dodajNaKraj(String noviTekst){
        if(noviTekst != null){
            if(this.tekst.equals("nepoznat")){
                this.tekst = noviTekst;
            }
            else{
                this.tekst = this.tekst + " "+ noviTekst;
            }
        }
        else{
            System.err.println("String koji je unet je prazan ...");
        }
    }
    public void proveraJednakosti(String noviTekst){
        if(this.tekst.equals(noviTekst)){
            System.out.println("Stringovi su jednaki ...");
        }
        else{
            System.out.println("Stringovi nisu jednaki ...");
        }
    }
    public void proveriJednakostBezObzira(String noviTekst){
        if(this.tekst.equalsIgnoreCase(noviTekst)){
            System.out.println("Stringovi si jednaki bez obzira na velicinu slova ...");
        }
        else{
            System.out.println("Stringovi nisu jednaki ...");
        }
    }
    public void leksikografskaProvera(String noviTekst){
        if(this.tekst.compareTo(noviTekst) > 0){
            System.out.println("Tekst je posle novog teksta ...");
        }
        else if(this.tekst.compareTo(noviTekst) < 0){
            System.out.println("Tekst je ispred novog teksta ...");
        }
        else{
            System.out.println("Tekstovi su jednaki");
        }
    }
}
