/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OceneStudenata;

/**
 *
 * @author David
 */
public class OceneStudenata {
    String[] ocene;
    
    public OceneStudenata(String ocene){
        if(ocene == null){
            System.out.println("Niste uneli ocenu za studenta");
        }
        else{
            this.ocene = ocene.split(";");
        }
    }
    public void ispisi(){
        for (int i = 0; i < this.ocene.length; i++) {
            System.out.println(ocene[i]);
        }
    }
    public void ispisiStudentiKojiSuPali(){
        for (int i = 0; i < ocene.length; i++) {
            String ocena = ocene[i].substring(ocene[i].lastIndexOf(" ")+1);
            if(ocena.equals("5")){
                System.out.println(ocene[i]);
            }
        }
    }
    public void ispitiStudenataKojiSuPolozili(){
        for (int i = 0; i < ocene.length; i++) {
            String ocena = ocene[i].substring(ocene[i].lastIndexOf(" ")+1);
            if(!ocena.equals("5")){
                System.out.println(ocene[i]);
            }
        }
    }
    public void godinaUpisa99(){
        for (int i = 0; i < ocene.length; i++) {
            String godina = ocene[i].substring(5,7);
            if(godina.equals("99")){
                System.out.println(ocene[i]);
            }
        }
    }
}
