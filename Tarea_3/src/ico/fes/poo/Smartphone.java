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
    
    public void Smartphone() {
    
        //System.out.println("Bienvenido a" + this.marca); 
        //return 0;
}
    public float porcbateria( int bateria){
        float reales= 0.0f;
        reales =(float) Math.random()*(float)bateria;
        System.out.println("Bienvenido a " + this.marca);
       return reales;
    }
    public void recibirllamada(){
        System.out.println("¿Quiere contestar");
       // return 0;
    }
    public void reproducirmusica(){
        System.out.println("¿Qué canción quieres reproducir" );
    }
}
