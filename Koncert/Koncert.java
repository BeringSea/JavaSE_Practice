/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koncert;

/**
 *
 * @author David
 */
public class Koncert {
    private String grad;
    private String bend;

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        if(grad == null)
            throw new RuntimeException("Morate uneti ime grada");
        this.grad = grad;
    }

    public String getBend() {
        return bend;
    }

    public void setBend(String bend) {
        if(bend == null)
            throw new RuntimeException("Morate uneti ime benda");
        this.bend = bend;
    }

    @Override
    public String toString() {
        return "Ime grada: "+this.grad+" Ime benda: "+this.bend;
    }
}
