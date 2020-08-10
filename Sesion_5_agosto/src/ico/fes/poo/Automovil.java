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
public class Automovil {
    public String marca;
    private String subMarca;
    private int modelo;
    private String color;
    
    //metodos de acceso
    public void setModelo ( int mod){
        if(mod>= 1914 && mod <= 2020){
        this.modelo=mod; 
    }   else {
        System.out.println("Ese modelo está fuera de rango"); 
    }
    }
    
    //public void setMarca (char mar ){
       // if(mar = Acura)
   // }
    public int getModelo(){
        return this.modelo;   
    }
    
    public void encender() {
        System.out.println("Encender el auto");
            }

    public void acelerar(){
    System.out.println("Acelerando");
        }

   public float avanzar (int metros){
    float reales=0.0f;
    reales =(float) Math.random()*(float)metros;
    System.out.println("Avanzando el auto " + this.marca);
        return reales;
}
   @Override
    public String toString() {
        return this.marca + "," + this.subMarca + "," + this.modelo + "," + this.color;
    }

    

        }
