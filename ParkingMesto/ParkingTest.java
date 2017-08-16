/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkingMesto;

/**
 *
 * @author David
 */
public class ParkingTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Parking parking = new Parking();
        parking.inicijalizujMesta();
        parking.unesiPodatke();
        parking.ispisiParkingMesta();
    }
    
}
