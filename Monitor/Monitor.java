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
public class Monitor {
    private String marka;
    private String model;
    private int velicinaEkrana;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        if(marka != null){
            this.marka = marka;
        }
        else{
            System.out.println("Greska");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model != null){
            this.model = model;
        }
        else{
            System.out.println("Greska");
        }
    }

    public int getVelicinaEkrana() {
        return velicinaEkrana;
    }

    public void setVelicinaEkrana(int velicinaEkrana) {
        if(velicinaEkrana > 12){
            this.velicinaEkrana = velicinaEkrana;
        }
        else{
            System.out.println("Greska");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Monitor){
            Monitor m = (Monitor)obj;
            if(marka.equals(m.getMarka())&& model.equals(m.getModel()) 
                    && velicinaEkrana == m.getVelicinaEkrana()){
                return true;
            }
            else{
            return false;
            }
        }
        else{
            System.out.println("Greska ...");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Marka monitora "+this.marka+" model monitora "+this.model+" velicina ekrana "+this.velicinaEkrana;
    }
    
}
