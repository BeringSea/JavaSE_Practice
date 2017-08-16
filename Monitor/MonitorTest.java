/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monitor;

/**
 *
 * @author David
 */
public class MonitorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Monitor m1 = new Monitor();
        Monitor m2 = new Monitor();
        m1.setMarka("Samsung");
        m1.setModel("SyncMster");
        m1.setVelicinaEkrana(15);
        m2.setMarka("Sony");
        m2.setModel("WS");
        m2.setVelicinaEkrana(17);
        
        if(m1.equals(m2)){
            System.out.println("U pitanju su isti monotiri ...");
        }
        else{
            System.out.println("U pitanju su razliciti monitori ...");
        }
        System.out.print(m1);
        System.out.println();
        System.out.print(m2);
    }
}
