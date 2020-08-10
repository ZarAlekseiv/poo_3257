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
public class Smartphone {
    public String marca;
    public String modelo;
    public String color;
    public int camara;
    
    public int ontelefono(int encender) {
    
        int real=0;
        real =(int)Math.abs(1)*(int)encender;
        System.out.println("Bienvenido a " + this.marca); 
       return real;
}
    public float porcbateria( int bateria){
        float reales= 0.0f;
        reales =(float)Math.random()*(float)bateria;
        System.out.println("Modelo: " + this.modelo);
        return reales;
    }
    public void hacerllamada(){
        System.out.println("¿Quiere contestar");
       // return 0;
    }
    public void reproducirmusica(){
        System.out.println("¿Qué canción quieres reproducir" );
    }
}
