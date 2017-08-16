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
public class OceneStudenataTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OceneStudenata os = new OceneStudenata("0067/99 Bojan Vukovic 10;0103/06 Jelena Jovic 6;"
                + "0001/99 Mika Lazic 5");
        
        os.ispitiStudenataKojiSuPolozili();
        os.ispisiStudentiKojiSuPali();
        os.godinaUpisa99();
    }
    
}
