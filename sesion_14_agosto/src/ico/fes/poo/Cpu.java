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
public class Cpu {
    
    private String marca;
    private float velocidad;
    private int numeroNucleo;

    public Cpu() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public int getNumeroNucleo() {
        return numeroNucleo;
    }

    public void setNumeroNucleo(int numeroNucleo) {
        this.numeroNucleo = numeroNucleo;
    }

    @Override
    public String toString() {
        return "Cpu{" + "marca=" + marca + ", velocidad=" + velocidad + ", numeroNucleo=" + numeroNucleo + '}';
    }
    
    
}
