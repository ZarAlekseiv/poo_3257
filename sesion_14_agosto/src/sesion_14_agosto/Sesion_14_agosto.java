/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_14_agosto;

import ico.fes.poo.Cpu;
import ico.fes.poo.Monitor;
import ico.fes.poo.Teclado;
import mx.lenovo.Computadora;

/**
 *
 * @author Perro de Tindalo
 */
public class Sesion_14_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Computadora c1 = new Computadora();
        System.out.println(c1);
        
        Computadora c2 = new Computadora("Lenovo", "LN2010", 
                new Monitor("Samsung", 32),
                new Cpu(),
                new Teclado ("Yenian", 50, true),
                null);
        
        System.out.println(c2);
    }
    
}
