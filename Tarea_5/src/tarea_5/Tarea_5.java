/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_5;

import ico.fes.book.Autor;
import ico.fes.book.Editorial;
import ico.fes.lbs.Libros;

/**
 *
 * @author Perro de Tindalo
 */
public class Tarea_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Libros l1 = new Libros(" Cosmos\n", 
              new Autor(" Sagan", " Carl", " Ciencia", " Estados Unidos\n", 0), 
              new Editorial(" Planeta", " 2004", 384));
      
        System.out.println(l1);
        System.out.println("\n");
            
      Libros l2 = new Libros("1984\n", 
              new Autor(" Orwell", " George", " Novela", " Raj Británico\n", 0), 
              new Editorial(" DeBolsillo", " 2013",  352));
        
      System.out.println(l2);
      System.out.println("\n");
      
      Libros l3 = new Libros(" Meditaciones\n",
              new Autor(" Aurelio", " Marco", " Filosofía", " Roma\n", 0), 
              new Editorial(" Editorial Ariel", " 2015",  200));
      
        System.out.println(l3);
        System.out.println("\n");
        
      Libros l4 = new Libros(" Siddharta\n", 
              new Autor(" Hesse", " Hermann", " Novela", " Alemania\n", 0), 
              new Editorial(" Publimex", "2013",  155));
      
        System.out.println(l4);
        System.out.println("\n");
 
}
}