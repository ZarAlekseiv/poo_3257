/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_12_agosto;

import ico.fes.poo.Foco;

/**
 *
 * @author Perro de Tindalo
 */
public class Sesion_12_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Foco f1 = new Foco ();
        System.out.println(f1);
   
        Foco f2 = new Foco("Phillips");
        System.out.println(f2);
        
        Foco f3 = new Foco("Cristal", "Led", "Bosch", true, 60.0f);
        System.out.println(f3);
        
        //String nombre = "AG";
        //System.out.println(nombre.charAt(0));
        
        //INSTANCIA : f1 is an INSTANCE of Foco = EJEMPLAR de clase 
        
    }
}
