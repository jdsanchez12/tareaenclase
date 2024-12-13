/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prytareaenclase;

/**
 *
 * @author Laboratorios DCCO
 */
public class Animal {
    //ATRIBUTOS
    public String nombre;
    public int edad;
    //CONSTRUCTOR

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //METODOS
    public void mtComer(){
        System.out.println(nombre+" ESTA COMIENDO");
    }
    public void mtDormir(){
       
    }
}
