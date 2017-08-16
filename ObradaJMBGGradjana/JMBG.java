/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObradaJMBGGradjana;

/**
 *
 * @author David
 */
public class JMBG {
    private static JMBG prvi = null; // pocetak liste maticnih brojeva
    private static JMBG posl = null; // kraj liste maticnih brojeva
    private JMBG sled = null; // sledeci objekat u listi
    private long jmbg; // vrednost maticnig broja u objektu
    
    public static boolean ima(long jmbg){ // da li vec postoji u listi
        for(JMBG tek = prvi; tek!=null; tek=tek.sled){
            if(jmbg == tek.jmbg)
                return true;
        }
        return false;
    }
    
    public JMBG(long jmbg){ // inicijalizacija novog objekta
        if(ima(jmbg)){
            System.exit(1);
        }
        this.jmbg = jmbg;
        if(prvi==null)
            prvi=this;
        else
            posl.sled = this;
        posl = this;
    }
    
    public boolean isti(JMBG jmbg){ // uporedjivanje na jednakost
        return this.jmbg == jmbg.jmbg;
    }

    @Override
    public String toString() { // tekstualni prikaz maticnig broja
        return "" + jmbg;
    }
    public static String svi(){ // tekstualni prikaz svih brojeva
        String s = "";
        for(JMBG tek = prvi; tek!=null; tek = tek.sled){
            s+=tek.jmbg + "\n";
        }
        return s;
    }
    
}
