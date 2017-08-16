/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.util.LinkedList;

/**
 *
 * @author David
 */
public class IspitnaLista {
    private LinkedList<Student> studenti;
    
    public IspitnaLista(){
        this.studenti = new LinkedList<Student>();
    }
    public boolean daLiJeUListi(Student student){
        if(studenti.contains(student)){
            return true;
        }
        return false;
    }
    public void dodajStudenta(Student student){
        if(student != null && !studenti.contains(student)){
            studenti.add(student);
        }
        else{
            System.out.println("Greska");
        }
    }
    public void dodajStudentaNaPocetak(Student student){
        if(student != null && !studenti.contains(student)){
            studenti.addFirst(student);
        }
        else{
            System.out.println("Greska");
        }
    }
    public void dodajStudentaNaKraj(Student student){
        if(student != null && !studenti.contains(student)){
            studenti.addLast(student);
        }
        else{
            System.out.println("Greska");
        }
    }
    public void dodajStudentaNaMesto(Student student, int mesto){
        if(student!=null && !studenti.contains(student) 
                && mesto < studenti.size()-1){
            studenti.add(mesto, student);
        }
        else{
            System.out.println("Greska");
        }
    }
    public void izbrisiStudenta(Student student){
        if(student!=null && !studenti.contains(student)){
            studenti.remove(student);
        }
        else{
            System.out.println("Greska");
        }
    }
    public void izbrisiStudentaSaKraja(){
        if(!studenti.isEmpty()){
            studenti.removeLast();
        }
        else{
            System.out.println("Greska");
        }
    }
    public void izbrisiStudentaSaMesta(int mesto){
        if(!studenti.isEmpty() && mesto < studenti.size() - 1){
            studenti.remove(mesto);
        }
        else{
            System.out.println("Greska");
        }
    }
    public void obrisiListu(){
        studenti.clear();
    }
    public void ispisiPrvog(){
        if(!studenti.isEmpty()){
            System.out.println(studenti.getFirst());
        }
        else{
            System.out.println("Lista je prazna ...");
        }
    }
    public void ispisiPoslednjeg(){
        if(!studenti.isEmpty()){
            System.out.println(studenti.getLast());
        }
        else{
            System.out.println("Lista je prazna ...");
        }
    }
    public void ispisi(){
        for (int i = 0; i < studenti.size(); i++) {
            System.out.println(studenti.get(i));
        }
    }
    public void ispisiDesetke(){
        for (int i = 0; i < studenti.size(); i++) {
            if(studenti.get(i).getOcena() == 10){
                System.out.println(studenti.get(i));
            }
        }
    }
    public double prosek(){
        double sumaOcena = 0;
        for (int i = 0; i < studenti.size(); i++) {
            sumaOcena+=studenti.get(i).getOcena();
        }
        return sumaOcena / studenti.size();
    }
    public void ispisiStareStudente(){
        for (int i = 0; i < studenti.size(); i++) {
            String godina = studenti.get(i).getBrojIndeksa().substring(5);
            if(godina.equals("99")){
                System.out.println(studenti.get(i));
            }
        }
    }
}
