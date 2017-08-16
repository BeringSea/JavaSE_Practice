/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author David
 */
public class Student {
    private String brojIndeksa;
    private String ime;
    private String prezime;
    private int ocena;

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        if(brojIndeksa != null){
            this.brojIndeksa = brojIndeksa;
        }
        else{
            System.out.println("Greska");
        }
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        if(ime != null){
            this.ime = ime;
        }
        else{
            System.out.println("Greska");
        }
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        if(prezime != null){
            this.prezime = prezime;
        }
        else{
            System.out.println("Greska");
        }
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        if(ocena >= 5 || ocena <= 10){
            this.ocena = ocena;
        }
        else{
            System.out.println("Greska");
        }
    }

    @Override
    public String toString() {
        return "Broj indeksa: "+this.brojIndeksa+" Ime: "+this.ime+" Prezime: "+this.prezime
                +" Ocena"+this.ocena;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            Student student = (Student)obj;
            if(this.brojIndeksa.equals(student.brojIndeksa)){
                return true;
            }
        }
        return
                false;
    }
}
