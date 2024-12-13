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
public class Mamifero extends Animal {
    //ATRIBUTOS
public String tipoPelaje;
//CONSTRUCTOR
    public Mamifero(String nombre, int edad, String tipoPelaje) {
        super(nombre, edad);
        this.tipoPelaje=tipoPelaje;
    }
    //METODO
    public void mtAmamantarCrias(){
        System.out.println(nombre+ " ESTA AMAMANTANDO SUS CRIAS");
    }
    
}
