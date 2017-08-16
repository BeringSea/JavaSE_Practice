/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutomatNovca;

import com.sun.org.apache.bcel.internal.classfile.ConstantObject;

/**
 *
 * @author David
 */
public class AutomatNovca implements AutomatNovcaInterfejs{

    double stanje = 20000;
    
    @Override
    public void uloziNovac(double iznos) {
       if(iznos > 0){
           if(iznos <= 20000){
               stanje += iznos;
           }
           else{
               System.err.println("Maksimalan iznos koji se moze uplatiti je 20 000");
           }
       }
    }

    @Override
    public void podigniNovac(double iznos) {
        if(iznos > 0 && stanje >= iznos){
            if(iznos <= 1000){
                stanje-=iznos;
            }
            else{
                System.err.println("Maksimalan iznos koji se moze potici je 1000");
            }
        }
    }
    public void ispisi(){
        System.out.println("Na stanju je "+stanje+" dinara");
    }
}
