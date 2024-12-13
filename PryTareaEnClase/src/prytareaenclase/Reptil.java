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
public class Reptil extends Animal {
    // ATRIBUTOS
public String tiposDeEscamas;
//CONSTRUCTOR
    public Reptil(String nombre, int edad, String tiposDeEscamas) {
        super(nombre, edad);
        this.tiposDeEscamas=tiposDeEscamas;
    }
    //METODO
    public void mtArrastrarse(){
        System.out.println(nombre+"  SE ESTA ARRASTRANDO CON SUS ESCAMAS DE TIPO "+tiposDeEscamas);
    }
}
