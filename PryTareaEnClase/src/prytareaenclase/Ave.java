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
public class Ave extends Animal {
    //ATRIBUTOS
public double envergaduraAlas;
//CONSTRUCTOR
    public Ave(String nombre, int edad, double envergaduraAlas) {
        super(nombre, edad);
        this.envergaduraAlas=envergaduraAlas;
    }
    //METODO
    public void mtVolar(){
        System.out.println(nombre+" ESTA VOLANDO CON UNA ENVERGADURA DE "+envergaduraAlas+" METROS.");
    }
}
