/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_final;

import ico.fes.poo.Electrodomestico;
import ico.fes.poo.Licuadora;
import ico.fes.poo.Refrigerador;

/**
 *
 * @author Perro de Tindalo
 */
public class Tarea_final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Electrodomestico e1 = new Electrodomestico("Whrilpool", "Z 266", "Rojo", 1200);
        e1.sugerir();
        System.out.println(e1);
        System.out.println("\n");
        
        Refrigerador r1 = new Refrigerador(180, 2, "Fibra de vidrio", 355, "Samsung", "RT38K5930S8", "Gris", 11000);
        r1.consumo();
        System.out.println(r1);
        r1.setConsumoElectricidad(38);
        System.out.println("\n");
        
        Refrigerador r2 = new Refrigerador(160, 0, "Aluminio", 300, "Whirlpool", "WP284SC3", "Blaco", 9000);
        System.out.println(r2);
        r2.consumo();
        System.out.println("\n");
        
        Licuadora l1 = new Licuadora(6, 3, "Plástico", 255, "Oster", "4126R3S", "Rojo", 600);
        System.out.println(l1);
        l1.usar();
        System.out.println("\n");
        
        Licuadora l2 = new Licuadora(4, 1, "Vidrio", 220);
        l2.setMarca("Phillips");
        l2.setModelo("PH351CS5");
        l2.setColor("Azul");
        l2.usar();
        System.out.println(l2);
        System.out.println("");

    }
    
}
