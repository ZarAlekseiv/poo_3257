/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;

/**
 *
 * @author Perro de Tindalo
 */
public class Circulo implements Figura{
    
    @Override
    public void dibujar(){
        System.out.println("Dibujando el circulo");
    
    }
    
    @Override
    public void colorear(){
        System.out.println("Coloreando el circulo");
    
    }
     @Override
    public int calcularArea(){
         System.out.println("PI * RADIO AL CUADRADO");
        return 15;
        
        
    }
}
