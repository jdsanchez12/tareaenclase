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
public class PryTareaEnClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //NOMBRAR A MIS OTRAS CLASES
        Mamifero mamifero=new Mamifero("TIGRE", 0, "LISO");
        Ave ave=new Ave("AGUILA", 5, 2.5);
        Reptil reptil=new Reptil("COBRA", 0, "LISAS");
        mamifero.mtComer();
        mamifero.mtAmamantarCrias();
        ave.mtComer();
        ave.mtVolar();
        reptil.mtComer();
        reptil.mtArrastrarse();
        
        
    }
    
}
